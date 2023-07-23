# AccountsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeRequest**](AccountsApi.md#completeRequest) | **PATCH** /api/accounts | Complete an accounts request
[**delete**](AccountsApi.md#delete) | **DELETE** /api/accounts/{id} | Delete an account
[**getDetails**](AccountsApi.md#getDetails) | **GET** /api/accounts/{id} | Get an account\&#39;s details
[**list**](AccountsApi.md#list) | **GET** /api/accounts | List all accounts
[**retrieve**](AccountsApi.md#retrieve) | **POST** /api/accounts | Retrieve accounts for a link


# **completeRequest**

#### **PATCH** /api/accounts

### Description
Used to resume an Account retrieve session that was paused because an MFA token was required by the institution.

  > 🚧 Scheduled field deprecation
  > 
  > Please note that we will soon be deprecating the following fields in our `loan_data` object:
  > - `cutting_date`
  > - `cutting_day`
  > - `credit_limit`: replaced by the `principal` field.
  > - `interest_rate`: replaced by the `interest_rates` object.
  > - `last_payment_date`
  > - `last_period_balance`: replaced by the `outstanding_balance ` field.
  > - `limit_day`
  > - `limit_date`: replaced by the `payment_day ` field.
  > - `no_interest_payment`
  > - `payment_due_day`

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeRequestResponse = await belvo.accounts.completeRequest({
  omit: "link,balance",
  fields: "link,balance,account",
  session: "6e7b283c6efa449c9c028a16b5c249fa",
  token: "1234ab",
  link: "683005d6-f45c-4adb-b289-f1a12f50f80c",
  save_data: true,
});

console.log(completeRequestResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patchBody** | **PatchBody**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<Account>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
**201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**408** | Request Timeout |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **delete**

#### **DELETE** /api/accounts/{id}

### Description
Delete a specific account and all associated transactions, as well as owners, from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.accounts.delete({
  id: "id_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `account.id` you want to delete | defaults to undefined


### Return type

void (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No content |  -  |
**401** | Authentication to Belvo API failed |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDetails**

#### **GET** /api/accounts/{id}

### Description
Get the details of a specific account.

  > 🚧 Scheduled field deprecation
  >
  > Please note that we will soon be deprecating the following fields in our `loan_data` object:
  > - `cutting_date`
  > - `cutting_day`
  > - `credit_limit`: replaced by the `principal` field.
  > - `interest_rate`: replaced by the `interest_rates` object.
  > - `last_payment_date`
  > - `last_period_balance`: replaced by the `outstanding_balance ` field.
  > - `limit_day`
  > - `limit_date`: replaced by the `payment_day ` field.
  > - `no_interest_payment`
  > - `payment_due_day`

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.accounts.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `account.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Account**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**401** | Authentication to Belvo API failed |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **list**

#### **GET** /api/accounts

### Description
Get a paginated list of all existing accounts in your Belvo account. By default, we return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.accounts.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  link: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  balanceAvailable: "4000.00",
  balanceAvailableLt: "6000.00",
  balanceAvailableLte: "5999.00",
  balanceAvailableGt: "2000.00",
  balanceAvailableGte: "1999.00",
  balanceAvailableRange: "3000.00,4350.00",
  balanceCurrent: "4000.00",
  balanceCurrentLt: "6000.00",
  balanceCurrentLte: "5999.00",
  balanceCurrentGt: "2000.00",
  balanceCurrentGte: "1999.00",
  balanceCurrentRange: "3000.00,4350.00",
  category: "CREDIT_ACCOUNT",
  categoryIn: "CHECKING_ACCOUNT,SAVINGS_ACCOUNT",
  createdAtGt: "2022-05-05",
  createdAtGte: "2022-05-04",
  createdAtLt: "2022-04-01",
  createdAtLte: "2022-03-30",
  createdAtRange: "2022-03-03,2022-05-04",
  currency: "COP",
  currencyIn: "COP,MXN",
  id: "24ccab1d-3a86-4136-a6eb-e04bf52b356f",
  idIn: "24ccab1d-3a86-4136-a6eb-e04bf52b356f,beb2b197-3cf7-428d-bef3-f415c0d57509",
  institution: "erebor_mx_retail",
  institutionIn: "erebor_mx_retail,gringotts_mx_retail",
  linkIn:
    "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65",
  name: "Cuenta Perfiles- M.N. - MXN-666",
  nameIcontains: "Perfiles",
  number: "4057068115181",
  numberIn: "4057068115181,7809346821648",
  publicIdentificationName: "CLABE",
  publicIdentificationValue: "150194683119900273",
  type: "Cuentas de efectivo",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **pageSize** | [**number**] | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  | (optional) defaults to 100
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **link** | [**string**] | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance.  | (optional) defaults to undefined
 **balanceAvailable** | [**string**] | Return accounts that have a `balance.available` matching exactly this value. | (optional) defaults to undefined
 **balanceAvailableLt** | [**string**] | Return accounts that have a `balance.available` less than this value. | (optional) defaults to undefined
 **balanceAvailableLte** | [**string**] | Return accounts that have a `balance.available` less than or equal to this value. | (optional) defaults to undefined
 **balanceAvailableGt** | [**string**] | Return accounts that have a `balance.available` greater than this value. | (optional) defaults to undefined
 **balanceAvailableGte** | [**string**] | Return accounts that have a `balance.available` greater than or equal to this value. | (optional) defaults to undefined
 **balanceAvailableRange** | [**string**] | Return accounts that have a `balance.available` within a range of two values. | (optional) defaults to undefined
 **balanceCurrent** | [**string**] | Return accounts that have a `balance.current` matching exactly this value. | (optional) defaults to undefined
 **balanceCurrentLt** | [**string**] | Return accounts that have a `balance.current` less than this value. | (optional) defaults to undefined
 **balanceCurrentLte** | [**string**] | Return accounts that have a `balance.available` less than or equal to this value. | (optional) defaults to undefined
 **balanceCurrentGt** | [**string**] | Return accounts that have a `balance.current` greater than this value. | (optional) defaults to undefined
 **balanceCurrentGte** | [**string**] | Return accounts that have a `balance.available` greater than or equal to this value. | (optional) defaults to undefined
 **balanceCurrentRange** | [**string**] | Return accounts that have a `balance.available` within a range of two values. | (optional) defaults to undefined
 **category** | [**string**] | Return accounts only for the given category (for example, `CHECKING_ACCOUNT` and `SAVINGS_ACCOUNT`). | (optional) defaults to undefined
 **categoryIn** | [**string**] | Return accounts only for the given categories (for example, `CHECKING_ACCOUNT` and `SAVINGS_ACCOUNT`). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return accounts that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return accounts that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return accounts that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return accounts that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return accounts that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **currency** | [**string**] | Return accounts that hold finances in only this three-letter currency code. | (optional) defaults to undefined
 **currencyIn** | [**string**] | Return accounts that hold finances in one of these three-letter currency codes. | (optional) defaults to undefined
 **id** | [**string**] | Return information only for this `account.id`. | (optional) defaults to undefined
 **idIn** | [**string**] | Return information for these `account.id`s. | (optional) defaults to undefined
 **institution** | [**string**] | Return accounts only for this institution (use the Belvo-designated name, such as `erebor_mx_retail`). | (optional) defaults to undefined
 **institutionIn** | [**string**] | Return accounts only for these institutions (use the Belvo-designated names, such as `erebor_mx_retail` and `gringotts_mx_retail`). | (optional) defaults to undefined
 **linkIn** | [**string**] | Return accounts only for these `link.id`s. | (optional) defaults to undefined
 **name** | [**string**] | Return accounts with exactly this internal (specified by the institution) name. | (optional) defaults to undefined
 **nameIcontains** | [**string**] | Return accounts partially matching this internal (specified by the institution) name. | (optional) defaults to undefined
 **number** | [**string**] | Return information only for this account number (as specified by the institution). | (optional) defaults to undefined
 **numberIn** | [**string**] | Return information for these account numbers (as specified by the institution). | (optional) defaults to undefined
 **publicIdentificationName** | [**string**] | Return information only for this type of account ID. For example, CLABE accounts. | (optional) defaults to undefined
 **publicIdentificationValue** | [**string**] | Return information only for this account ID. For example, the account number for a CLABE account. | (optional) defaults to undefined
 **type** | [**string**] | Return information only for accounts matching this account type, as designated by the institution. | (optional) defaults to undefined


### Return type

**AccountsPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**401** | Authentication to Belvo API failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **retrieve**

#### **POST** /api/accounts

### Description
Retrieve accounts from an existing link.

  > 🚧 Scheduled field deprecation
  > 
  > Please note that we will soon be deprecating the following fields in our `loan_data` object:
  > - `cutting_date`
  > - `cutting_day`
  > - `credit_limit`: replaced by the `principal` field.
  > - `interest_rate`: replaced by the `interest_rates` object.
  > - `last_payment_date`
  > - `last_period_balance`: replaced by the `outstanding_balance ` field.
  > - `limit_day`
  > - `limit_date`: replaced by the `payment_day ` field.
  > - `no_interest_payment`
  > - `payment_due_day`

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.accounts.retrieve({
  omit: "link,balance",
  fields: "link,balance,account",
  link: "2ccd5e15-194a-4a19-a45a-e7223c7e6717",
  token: "1234ab",
  save_data: true,
});

console.log(retrieveResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardRequest** | **StandardRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<Account>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
**201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**408** | Request Timeout |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


