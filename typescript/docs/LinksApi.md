# LinksApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeAccessMode**](LinksApi.md#changeAccessMode) | **PATCH** /api/links/{id} | Change a link\&#39;s access mode
[**completeRequest**](LinksApi.md#completeRequest) | **PATCH** /api/links | Complete a links request
[**destroy**](LinksApi.md#destroy) | **DELETE** /api/links/{id} | Delete a link
[**getDetails**](LinksApi.md#getDetails) | **GET** /api/links/{id} | Get a link\&#39;s details
[**list**](LinksApi.md#list) | **GET** /api/links | List all links
[**register**](LinksApi.md#register) | **POST** /api/links | Register a new link
[**update**](LinksApi.md#update) | **PUT** /api/links/{id} | Update a link\&#39;s credentials


# **changeAccessMode**

#### **PATCH** /api/links/{id}

### Description
Change a link's access mode from `single` to `recurrent` or from `recurrent` to single.
ℹ️ **Note**: When you change a link from `single`` to `recurrent`, they will only be updated the next day at the scheduled interval.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const changeAccessModeResponse = await belvo.links.changeAccessMode({
  id: "e4bb1afb-4a4f-4dd6-8be0-e615d233185b",
  omit: "link,balance",
  fields: "link,balance,account",
  access_mode: "recurrent",
});

console.log(changeAccessModeResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeAccessMode** | **ChangeAccessMode**|  |
 **id** | [**string**] | The `link.id` you want to change the `access_mode` for. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Link**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**404** | Not Found |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **completeRequest**

#### **PATCH** /api/links

### Description
Used to resume a Link register session that was paused because an MFA token was required by the institution.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeRequestResponse = await belvo.links.completeRequest({
  omit: "link,balance",
  fields: "link,balance,account",
  session: "6e7b283c6efa449c9c028a16b5c249fa",
  token: "1234ab",
  link: "683005d6-f45c-4adb-b289-f1a12f50f80c",
});

console.log(completeRequestResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patchBodyWithoutSaveData** | **PatchBodyWithoutSaveData**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Link**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **destroy**

#### **DELETE** /api/links/{id}

### Description
Delete a specific link and all associated accounts, transactions, and owners from your Belvo account.
# Deleting links in batches
To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.

  > 🚧 **Rate limiting and IP blocking**
  > 
  > An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.
  > 
  > For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const destroyResponse = await belvo.links.destroy({
  id: "id_example",
});

console.log(destroyResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `link.id` that you want to delete. | defaults to undefined


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

#### **GET** /api/links/{id}

### Description
Get the details of a specific link.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.links.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `link.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Link**

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

#### **GET** /api/links

### Description
Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.links.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  accessMode: "single",
  createdAt: "2022-05-01",
  createdAtGt: "2022-05-05",
  createdAtGte: "2022-05-04",
  createdAtLt: "2022-04-01",
  createdAtLte: "2022-03-30",
  createdAtRange: "2022-03-03,2022-05-04",
  createdByNotIn:
    "578947e2-3c9a-4401-bbad-59b2f2d2b91b,d3d941ab-4ca5-43c1-8b23-db329ee4cb7e",
  externalId: "InternalUser4000",
  externalIdIn: "InternalUser4000,InternalUser4001",
  id: "73694155-b871-41ec-94e3-37d17ff62b5d",
  idIn: "73694155-b871-41ec-94e3-37d17ff62b5d,40968d42-7d89-49e3-9931-78baa8e0544e",
  institution: "erebor_mx_retail",
  institutionIn: "erebor_mx_retail,gringotts_co_retail",
  institutionUserId: "ezFoxjPDr7YnASnOaft5F3zt7D0kurgDNlLtZFjxUo0=",
  institutionUserIdIn:
    "ezFoxjPDr7YnASnOaft5F3zt7D0kurgDNlLtZFjxUo0=,YwuTM0uEEh1BbVgDZBcNpa_-Tm3l2q8ZkZNrlhp-pNA=",
  refreshRate: "24h",
  status: "invalid",
  statusIn: "invalid,unconfirmed",
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
 **accessMode** | [**string**] | Return links only with this access mode. Can be either `single` or `recurrent`. | (optional) defaults to undefined
 **createdAt** | [**string**] | Return links that were last updated in Belvo\'s database on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return links that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return links that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return links that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return links that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return links that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdByNotIn** | [**string**] | Return links that were not created by these Belvo users. | (optional) defaults to undefined
 **externalId** | [**string**] | Return links with this external ID. | (optional) defaults to undefined
 **externalIdIn** | [**string**] | Return links with these external IDs. | (optional) defaults to undefined
 **id** | [**string**] | Return information only for this `link.id`. | (optional) defaults to undefined
 **idIn** | [**string**] | Return information only for these `link.id`s. | (optional) defaults to undefined
 **institution** | [**string**] | Return links created for this institution (use the Belvo-designated name, such as `erebor_mx_retail`). | (optional) defaults to undefined
 **institutionIn** | [**string**] | Return links created for these institutions (use the Belvo-designated name, such as `erebor_mx_retail` and `gringotts_co_retail`). | (optional) defaults to undefined
 **institutionUserId** | [**string**] | Return links with this specific institution user ID. | (optional) defaults to undefined
 **institutionUserIdIn** | [**string**] | Return links with these institution user IDs. | (optional) defaults to undefined
 **refreshRate** | [**string**] | Return links with this refresh rate. Choose between `6h`, `12h`, `24h`, `7d`, or `30d`. | (optional) defaults to undefined
 **status** | [**string**] | Return links with this status. Choose between `valid`, `invalid`, `unconfirmed`, or `token_required`. | (optional) defaults to undefined
 **statusIn** | [**string**] | Return links with these statuses. Choose between `valid`, `invalid`, `unconfirmed`, or `token_required`. | (optional) defaults to undefined


### Return type

**PaginatedResponseLink**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**401** | Authentication to Belvo API failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **register**

#### **POST** /api/links

### Description
Register a new link with your Belvo account.

<div style="background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px">
<strong>Note: </strong> We recommend using our <a href="https://developers.belvo.com/docs/connect-widget" target="_blank">Connect Widget</a> to handle link creation and link status updates.
</div>


### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const registerResponse = await belvo.links.register({
  omit: "link,balance",
  fields: "link,balance,account",
  institution: "erebor_mx_retail",
  username: "username",
  password: "password",
  external_id: "56ab5706-6e00-48a4-91c9-ca55968678d9",
  username2: "secondusername",
  username3: "thirdusername",
  password2: "pin",
  token: "1234ab",
  access_mode: "recurrent",
  fetch_historical: true,
  credentials_storage: "store",
  username_type: "001",
  certificate: "1234567890abcd=",
  private_key: "1234567890abcd=",
});

console.log(registerResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linksRequest** | **LinksRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Link**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **update**

#### **PUT** /api/links/{id}

### Description
Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you'll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks.
<div style="background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px"> <strong>Note: </strong> We recommend using our <a href="https://developers.belvo.com/docs/connect-widget" target="_blank">Connect Widget</a> to handle updating <code>invalid</code> or <code>token_required</code> links. </div>


### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const updateResponse = await belvo.links.update({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
  password: "password",
  password2: "pin",
  token: "1234ab",
  username_type: "001",
  certificate: "1234567890abcd=",
  private_key: "1234567890abcd=",
});

console.log(updateResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linksPutRequest** | **LinksPutRequest**|  |
 **id** | [**string**] | The `link.id` you want to update. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Link**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**404** | Not Found |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


