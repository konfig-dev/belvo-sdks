<a name="__pageTop"></a>
# belvo_client.apis.tags.accounts_api.AccountsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complete_request**](#complete_request) | **patch** /api/accounts | Complete an accounts request
[**delete**](#delete) | **delete** /api/accounts/{id} | Delete an account
[**get_details**](#get_details) | **get** /api/accounts/{id} | Get an account&#x27;s details
[**list**](#list) | **get** /api/accounts | List all accounts
[**retrieve**](#retrieve) | **post** /api/accounts | Retrieve accounts for a link

# **complete_request**
<a name="complete_request"></a>
> AccountsCompleteRequestResponse complete_request(patch_body)

Complete an accounts request

Used to resume an Account retrieve session that was paused because an MFA token was required by the institution.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`

### Example

```python
from pprint import pprint
from belvo_client import Belvo

belvo = Belvo(
    # Defining the host is optional and defaults to https://sandbox.belvo.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://sandbox.belvo.com",

    # Configure HTTP basic authorization: basicAuth
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

body = {
        "session": "6e7b283c6efa449c9c028a16b5c249fa",
        "token": "1234ab",
        "link": "683005d6-f45c-4adb-b289-f1a12f50f80c",
        "save_data": True,
    }
try:
    # Complete an accounts request
    complete_request_response = belvo.accounts.complete_request(
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
        body=body
    )
    pprint(complete_request_response.body)
    pprint(complete_request_response.headers)
    pprint(complete_request_response.status)
    pprint(complete_request_response.round_trip_time)
except ApiException as e:
    print("Exception when calling AccountsApi.complete_request: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
query_params | RequestQueryParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PatchBody**](../../models/PatchBody.md) |  | 


### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
omit | OmitSchema | | optional
fields | FieldsSchema | | optional


# OmitSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# FieldsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#complete_request.ApiResponseFor200) | Ok (when &#x60;save_data&#x3D;false&#x60;)
201 | [ApiResponseFor201](#complete_request.ApiResponseFor201) | Created (when &#x60;save_data&#x3D;true&#x60;)
400 | [ApiResponseFor400](#complete_request.ApiResponseFor400) | Bad request error
401 | [ApiResponseFor401](#complete_request.ApiResponseFor401) | Authentication to Belvo API failed
408 | [ApiResponseFor408](#complete_request.ApiResponseFor408) | Request Timeout
428 | [ApiResponseFor428](#complete_request.ApiResponseFor428) | MFA Token Required
500 | [ApiResponseFor500](#complete_request.ApiResponseFor500) | Unexpected Error

#### complete_request.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsCompleteRequestResponse**](../../models/AccountsCompleteRequestResponse.md) |  | 


#### complete_request.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsCompleteRequest201Response**](../../models/AccountsCompleteRequest201Response.md) |  | 


#### complete_request.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsCompleteRequest400Response**](../../models/AccountsCompleteRequest400Response.md) |  | 


#### complete_request.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsCompleteRequest401Response**](../../models/AccountsCompleteRequest401Response.md) |  | 


#### complete_request.ApiResponseFor408
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor408ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor408ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsCompleteRequest408Response**](../../models/AccountsCompleteRequest408Response.md) |  | 


#### complete_request.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsCompleteRequest428Response**](../../models/AccountsCompleteRequest428Response.md) |  | 


#### complete_request.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsCompleteRequest500Response**](../../models/AccountsCompleteRequest500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **delete**
<a name="delete"></a>
> delete(id)

Delete an account

Delete a specific account and all associated transactions, as well as owners, from your Belvo account.

### Example

```python
from pprint import pprint
from belvo_client import Belvo

belvo = Belvo(
    # Defining the host is optional and defaults to https://sandbox.belvo.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://sandbox.belvo.com",

    # Configure HTTP basic authorization: basicAuth
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

try:
    # Delete an account
    belvo.accounts.delete(
        path_params = {
            'id': "id_example",
        },
    )
    pprint(delete_response.headers)
    pprint(delete_response.status)
    pprint(delete_response.round_trip_time)
except ApiException as e:
    print("Exception when calling AccountsApi.delete: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
id | IdSchema | | 

# IdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, uuid.UUID,  | str,  |  | value must be a uuid

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#delete.ApiResponseFor204) | No content
401 | [ApiResponseFor401](#delete.ApiResponseFor401) | Authentication to Belvo API failed
404 | [ApiResponseFor404](#delete.ApiResponseFor404) | Not Found

#### delete.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### delete.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsDeleteResponse**](../../models/AccountsDeleteResponse.md) |  | 


#### delete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsDelete404Response**](../../models/AccountsDelete404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_details**
<a name="get_details"></a>
> Account get_details(id)

Get an account&#x27;s details

Get the details of a specific account.    > 🚧 Scheduled field deprecation   >   > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`

### Example

```python
from pprint import pprint
from belvo_client import Belvo

belvo = Belvo(
    # Defining the host is optional and defaults to https://sandbox.belvo.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://sandbox.belvo.com",

    # Configure HTTP basic authorization: basicAuth
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

try:
    # Get an account's details
    get_details_response = belvo.accounts.get_details(
        path_params = {
            'id': "id_example",
        },
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
    )
    pprint(get_details_response.body)
    pprint(get_details_response.body["collected_at"])
    pprint(get_details_response.body["category"])
    pprint(get_details_response.body["balance_type"])
    pprint(get_details_response.body["type"])
    pprint(get_details_response.body["name"])
    pprint(get_details_response.body["number"])
    pprint(get_details_response.body["balance"])
    pprint(get_details_response.body["currency"])
    pprint(get_details_response.body["public_identification_name"])
    pprint(get_details_response.body["public_identification_value"])
    pprint(get_details_response.body["last_accessed_at"])
    pprint(get_details_response.body["credit_data"])
    pprint(get_details_response.body["loan_data"])
    pprint(get_details_response.body["id"])
    pprint(get_details_response.body["link"])
    pprint(get_details_response.body["institution"])
    pprint(get_details_response.body["created_at"])
    pprint(get_details_response.body["funds_data"])
    pprint(get_details_response.body["receivables_data"])
    pprint(get_details_response.body["bank_product_id"])
    pprint(get_details_response.body["internal_identification"])
    pprint(get_details_response.headers)
    pprint(get_details_response.status)
    pprint(get_details_response.round_trip_time)
except ApiException as e:
    print("Exception when calling AccountsApi.get_details: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
omit | OmitSchema | | optional
fields | FieldsSchema | | optional


# OmitSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# FieldsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
id | IdSchema | | 

# IdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, uuid.UUID,  | str,  |  | value must be a uuid

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_details.ApiResponseFor200) | Ok
401 | [ApiResponseFor401](#get_details.ApiResponseFor401) | Authentication to Belvo API failed
404 | [ApiResponseFor404](#get_details.ApiResponseFor404) | Not Found

#### get_details.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Account**](../../models/Account.md) |  | 


#### get_details.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsGetDetailsResponse**](../../models/AccountsGetDetailsResponse.md) |  | 


#### get_details.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsGetDetails404Response**](../../models/AccountsGetDetails404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list**
<a name="list"></a>
> AccountsPaginatedResponse list()

List all accounts

Get a paginated list of all existing accounts in your Belvo account. By default, we return up to 100 results per page.

### Example

```python
from pprint import pprint
from belvo_client import Belvo

belvo = Belvo(
    # Defining the host is optional and defaults to https://sandbox.belvo.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://sandbox.belvo.com",

    # Configure HTTP basic authorization: basicAuth
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

try:
    # List all accounts
    list_response = belvo.accounts.list(
        query_params = {
            'page': 1,
            'page_size': 100,
            'omit': "link,balance",
            'fields': "link,balance,account",
            'link': "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
            'balance__available': "4000.00",
            'balance__available__lt': "6000.00",
            'balance__available__lte': "5999.00",
            'balance__available__gt': "2000.00",
            'balance__available__gte': "1999.00",
            'balance__available__range': "3000.00,4350.00",
            'balance__current': "4000.00",
            'balance__current__lt': "6000.00",
            'balance__current__lte': "5999.00",
            'balance__current__gt': "2000.00",
            'balance__current__gte': "1999.00",
            'balance__current__range': "3000.00,4350.00",
            'category': "CREDIT_ACCOUNT",
            'category__in': "CHECKING_ACCOUNT,SAVINGS_ACCOUNT",
            'created_at__gt': "2022-05-05",
            'created_at__gte': "2022-05-04",
            'created_at__lt': "2022-04-01",
            'created_at__lte': "2022-03-30",
            'created_at__range': "2022-03-03,2022-05-04",
            'currency': "COP",
            'currency__in': "COP,MXN",
            'id': "24ccab1d-3a86-4136-a6eb-e04bf52b356f",
            'id__in': "24ccab1d-3a86-4136-a6eb-e04bf52b356f,beb2b197-3cf7-428d-bef3-f415c0d57509",
            'institution': "erebor_mx_retail",
            'institution__in': "erebor_mx_retail,gringotts_mx_retail",
            'link__in': "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65",
            'name': "Cuenta Perfiles- M.N. - MXN-666",
            'name__icontains': "Perfiles",
            'number': "4057068115181",
            'number__in': "4057068115181,7809346821648",
            'public_identification_name': "CLABE",
            'public_identification_value': "150194683119900273",
            'type': "Cuentas de efectivo",
        },
    )
    pprint(list_response.body)
    pprint(list_response.body["count"])
    pprint(list_response.body["next"])
    pprint(list_response.body["previous"])
    pprint(list_response.body["results"])
    pprint(list_response.headers)
    pprint(list_response.status)
    pprint(list_response.round_trip_time)
except ApiException as e:
    print("Exception when calling AccountsApi.list: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
page | PageSchema | | optional
page_size | PageSizeSchema | | optional
omit | OmitSchema | | optional
fields | FieldsSchema | | optional
link | LinkSchema | | optional
balance__available | BalanceAvailableSchema | | optional
balance__available__lt | BalanceAvailableLtSchema | | optional
balance__available__lte | BalanceAvailableLteSchema | | optional
balance__available__gt | BalanceAvailableGtSchema | | optional
balance__available__gte | BalanceAvailableGteSchema | | optional
balance__available__range | BalanceAvailableRangeSchema | | optional
balance__current | BalanceCurrentSchema | | optional
balance__current__lt | BalanceCurrentLtSchema | | optional
balance__current__lte | BalanceCurrentLteSchema | | optional
balance__current__gt | BalanceCurrentGtSchema | | optional
balance__current__gte | BalanceCurrentGteSchema | | optional
balance__current__range | BalanceCurrentRangeSchema | | optional
category | CategorySchema | | optional
category__in | CategoryInSchema | | optional
created_at__gt | CreatedAtGtSchema | | optional
created_at__gte | CreatedAtGteSchema | | optional
created_at__lt | CreatedAtLtSchema | | optional
created_at__lte | CreatedAtLteSchema | | optional
created_at__range | CreatedAtRangeSchema | | optional
currency | CurrencySchema | | optional
currency__in | CurrencyInSchema | | optional
id | IdSchema | | optional
id__in | IdInSchema | | optional
institution | InstitutionSchema | | optional
institution__in | InstitutionInSchema | | optional
link__in | LinkInSchema | | optional
name | NameSchema | | optional
name__icontains | NameIcontainsSchema | | optional
number | NumberSchema | | optional
number__in | NumberInSchema | | optional
public_identification_name | PublicIdentificationNameSchema | | optional
public_identification_value | PublicIdentificationValueSchema | | optional
type | TypeSchema | | optional


# PageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 100value must be a 32 bit integer

# OmitSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# FieldsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LinkSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, uuid.UUID,  | str,  |  | value must be a uuid

# BalanceAvailableSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceAvailableLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceAvailableLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceAvailableGtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceAvailableGteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceAvailableRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceCurrentSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceCurrentLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceCurrentLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceCurrentGtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceCurrentGteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BalanceCurrentRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CategorySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CategoryInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CreatedAtGtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CreatedAtGteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CreatedAtLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CreatedAtLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CreatedAtRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CurrencySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CurrencyInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# IdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# IdInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# InstitutionSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# InstitutionInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LinkInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# NameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# NameIcontainsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# NumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# NumberInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# PublicIdentificationNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# PublicIdentificationValueSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# TypeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#list.ApiResponseFor200) | Ok
401 | [ApiResponseFor401](#list.ApiResponseFor401) | Authentication to Belvo API failed

#### list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsPaginatedResponse**](../../models/AccountsPaginatedResponse.md) |  | 


#### list.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsListResponse**](../../models/AccountsListResponse.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **retrieve**
<a name="retrieve"></a>
> AccountsRetrieveResponse retrieve(standard_request)

Retrieve accounts for a link

Retrieve accounts from an existing link.    > 🚧 Scheduled field deprecation   >    > Please note that we will soon be deprecating the following fields in our `loan_data` object:   > - `cutting_date`   > - `cutting_day`   > - `credit_limit`: replaced by the `principal` field.   > - `interest_rate`: replaced by the `interest_rates` object.   > - `last_payment_date`   > - `last_period_balance`: replaced by the `outstanding_balance ` field.   > - `limit_day`   > - `limit_date`: replaced by the `payment_day ` field.   > - `no_interest_payment`   > - `payment_due_day`

### Example

```python
from pprint import pprint
from belvo_client import Belvo

belvo = Belvo(
    # Defining the host is optional and defaults to https://sandbox.belvo.com
    # See configuration.py for a list of all supported configuration parameters.
    host = "https://sandbox.belvo.com",

    # Configure HTTP basic authorization: basicAuth
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)

body = {
        "link": "2ccd5e15-194a-4a19-a45a-e7223c7e6717",
        "token": "1234ab",
        "save_data": True,
    }
try:
    # Retrieve accounts for a link
    retrieve_response = belvo.accounts.retrieve(
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
        body=body
    )
    pprint(retrieve_response.body)
    pprint(retrieve_response.headers)
    pprint(retrieve_response.status)
    pprint(retrieve_response.round_trip_time)
except ApiException as e:
    print("Exception when calling AccountsApi.retrieve: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
query_params | RequestQueryParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**StandardRequest**](../../models/StandardRequest.md) |  | 


### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
omit | OmitSchema | | optional
fields | FieldsSchema | | optional


# OmitSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# FieldsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#retrieve.ApiResponseFor200) | Ok (when &#x60;save_data&#x3D;false&#x60;)
201 | [ApiResponseFor201](#retrieve.ApiResponseFor201) | Created (when &#x60;save_data&#x3D;true&#x60;)
400 | [ApiResponseFor400](#retrieve.ApiResponseFor400) | Bad request error
401 | [ApiResponseFor401](#retrieve.ApiResponseFor401) | Authentication to Belvo API failed
408 | [ApiResponseFor408](#retrieve.ApiResponseFor408) | Request Timeout
428 | [ApiResponseFor428](#retrieve.ApiResponseFor428) | MFA Token Required
500 | [ApiResponseFor500](#retrieve.ApiResponseFor500) | Unexpected Error

#### retrieve.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsRetrieveResponse**](../../models/AccountsRetrieveResponse.md) |  | 


#### retrieve.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsRetrieve201Response**](../../models/AccountsRetrieve201Response.md) |  | 


#### retrieve.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsRetrieve400Response**](../../models/AccountsRetrieve400Response.md) |  | 


#### retrieve.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsRetrieve401Response**](../../models/AccountsRetrieve401Response.md) |  | 


#### retrieve.ApiResponseFor408
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor408ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor408ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsRetrieve408Response**](../../models/AccountsRetrieve408Response.md) |  | 


#### retrieve.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsRetrieve428Response**](../../models/AccountsRetrieve428Response.md) |  | 


#### retrieve.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccountsRetrieve500Response**](../../models/AccountsRetrieve500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

