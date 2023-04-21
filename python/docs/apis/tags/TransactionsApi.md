<a name="__pageTop"></a>
# belvo_client.apis.tags.transactions_api.TransactionsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complete_request**](#complete_request) | **patch** /api/transactions | Complete a transactions request
[**delete**](#delete) | **delete** /api/transactions/{id} | Delete a transaction
[**get_details**](#get_details) | **get** /api/transactions/{id} | Get a transaction&#x27;s details
[**list**](#list) | **get** /api/transactions | List all transactions
[**retrieve**](#retrieve) | **post** /api/transactions | Retrieve transactions for a link

# **complete_request**
<a name="complete_request"></a>
> TransactionsCompleteRequestResponse complete_request(patch_body)

Complete a transactions request

Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.

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
    # Complete a transactions request
    complete_request_response = belvo.transactions.complete_request(
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
    print("Exception when calling TransactionsApi.complete_request: %s\n" % e)
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
[**TransactionsCompleteRequestResponse**](../../models/TransactionsCompleteRequestResponse.md) |  | 


#### complete_request.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsCompleteRequest201Response**](../../models/TransactionsCompleteRequest201Response.md) |  | 


#### complete_request.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsCompleteRequest400Response**](../../models/TransactionsCompleteRequest400Response.md) |  | 


#### complete_request.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsCompleteRequest401Response**](../../models/TransactionsCompleteRequest401Response.md) |  | 


#### complete_request.ApiResponseFor408
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor408ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor408ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsCompleteRequest408Response**](../../models/TransactionsCompleteRequest408Response.md) |  | 


#### complete_request.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsCompleteRequest428Response**](../../models/TransactionsCompleteRequest428Response.md) |  | 


#### complete_request.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsCompleteRequest500Response**](../../models/TransactionsCompleteRequest500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **delete**
<a name="delete"></a>
> delete(id)

Delete a transaction

Delete a specific transaction from your Belvo account.

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
    # Delete a transaction
    belvo.transactions.delete(
        path_params = {
            'id': "id_example",
        },
    )
    pprint(delete_response.headers)
    pprint(delete_response.status)
    pprint(delete_response.round_trip_time)
except ApiException as e:
    print("Exception when calling TransactionsApi.delete: %s\n" % e)
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
[**TransactionsDeleteResponse**](../../models/TransactionsDeleteResponse.md) |  | 


#### delete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsDelete404Response**](../../models/TransactionsDelete404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_details**
<a name="get_details"></a>
> Transaction get_details(id)

Get a transaction&#x27;s details

Get the details of a specific transaction.

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
    # Get a transaction's details
    get_details_response = belvo.transactions.get_details(
        path_params = {
            'id': "id_example",
        },
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
    )
    pprint(get_details_response.body)
    pprint(get_details_response.body["description"])
    pprint(get_details_response.body["account"])
    pprint(get_details_response.body["collected_at"])
    pprint(get_details_response.body["value_date"])
    pprint(get_details_response.body["accounting_date"])
    pprint(get_details_response.body["amount"])
    pprint(get_details_response.body["balance"])
    pprint(get_details_response.body["currency"])
    pprint(get_details_response.body["observations"])
    pprint(get_details_response.body["merchant"])
    pprint(get_details_response.body["category"])
    pprint(get_details_response.body["reference"])
    pprint(get_details_response.body["type"])
    pprint(get_details_response.body["status"])
    pprint(get_details_response.body["id"])
    pprint(get_details_response.body["internal_identification"])
    pprint(get_details_response.body["created_at"])
    pprint(get_details_response.body["subcategory"])
    pprint(get_details_response.body["credit_card_data"])
    pprint(get_details_response.headers)
    pprint(get_details_response.status)
    pprint(get_details_response.round_trip_time)
except ApiException as e:
    print("Exception when calling TransactionsApi.get_details: %s\n" % e)
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
[**Transaction**](../../models/Transaction.md) |  | 


#### get_details.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsGetDetailsResponse**](../../models/TransactionsGetDetailsResponse.md) |  | 


#### get_details.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsGetDetails404Response**](../../models/TransactionsGetDetails404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list**
<a name="list"></a>
> TransactionsPaginatedResponse list(link)

List all transactions

Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.

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
    # List all transactions
    list_response = belvo.transactions.list(
        query_params = {
            'page': 1,
            'page_size': 100,
            'omit': "link,balance",
            'fields': "link,balance,account",
            'link': "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
            'account': "d979df3a-5d0f-4cc9-9bd4-b75c28b45963",
            'account__balance__available': "4000.00",
            'account__balance__available__lt': "6000.00",
            'account__balance__available__lte': "5999.00",
            'account__balance__available__range': "3000.00,4350.00",
            'account__balance__current': "4000.00",
            'account__balance__current__gt': "4020.00",
            'account__balance__current__gte': "4019.00",
            'account__balance__current__lt': "3000.00",
            'account__balance__current__lte': "2999.00",
            'account__balance__current__range': "2999.00,4000.00",
            'account__in': "24ccab1d-3a86-4136-a6eb-e04bf52b356f,beb2b197-3cf7-428d-bef3-f415c0d57509",
            'account_type': "Cuentas de efectivo",
            'account_type__in': "Cuentas de efectivo,Depositos Ahorro",
            'accounting_date': "2022-05-05",
            'accounting_date__gt': "2022-05-06",
            'accounting_date__gte': "2022-05-04",
            'accounting_date__lt': "2022-03-02",
            'accounting_date__lte': "2022-03-01",
            'accounting_date__range': "2022-03-01,2022-05-06",
            'amount': "1000.00",
            'amount__gt': "520.00",
            'amount__gte': "519.00",
            'amount__lt': "540.00",
            'amount__lte': "541.00",
            'amount__range': "519.00,541.00",
            'collected_at': "2022-05-01",
            'collected_at__gt': "2022-05-05",
            'collected_at__gte': "2022-05-04",
            'collected_at__lt': "2022-04-01",
            'collected_at__lte': "2022-03-30",
            'collected_at__range': "2022-03-03,2022-05-04",
            'created_at': "2022-05-01",
            'created_at__gt': "2022-05-05",
            'created_at__gte': "2022-05-04",
            'created_at__lt': "2022-04-01",
            'created_at__lte': "2022-03-30",
            'created_at__range': "2022-03-03,2022-05-04",
            'credit_card_data__bill_name__in': "maio-2022,feb-2022",
            'currency': "COP",
            'currency__in': "COP,MXN",
            'reference': "085904452810319225",
            'reference__in': "085904452810319225,8703",
            'status': "PENDING",
            'status__in': "PENDING,PROCESSED",
            'type': "OUTFLOW",
            'type__in': "INFLOW,OUTFLOW",
            'value_date': "2022-05-05",
            'value_date__gt': "2022-05-06",
            'value_date__gte': "2022-05-04",
            'value_date__lt': "2022-03-02",
            'value_date__lte': "2022-03-01",
            'value_date__range': "2022-03-01,2022-05-06",
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
    print("Exception when calling TransactionsApi.list: %s\n" % e)
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
link | LinkSchema | | 
account | AccountSchema | | optional
account__balance__available | AccountBalanceAvailableSchema | | optional
account__balance__available__lt | AccountBalanceAvailableLtSchema | | optional
account__balance__available__lte | AccountBalanceAvailableLteSchema | | optional
account__balance__available__range | AccountBalanceAvailableRangeSchema | | optional
account__balance__current | AccountBalanceCurrentSchema | | optional
account__balance__current__gt | AccountBalanceCurrentGtSchema | | optional
account__balance__current__gte | AccountBalanceCurrentGteSchema | | optional
account__balance__current__lt | AccountBalanceCurrentLtSchema | | optional
account__balance__current__lte | AccountBalanceCurrentLteSchema | | optional
account__balance__current__range | AccountBalanceCurrentRangeSchema | | optional
account__in | AccountInSchema | | optional
account_type | AccountTypeSchema | | optional
account_type__in | AccountTypeInSchema | | optional
accounting_date | AccountingDateSchema | | optional
accounting_date__gt | AccountingDateGtSchema | | optional
accounting_date__gte | AccountingDateGteSchema | | optional
accounting_date__lt | AccountingDateLtSchema | | optional
accounting_date__lte | AccountingDateLteSchema | | optional
accounting_date__range | AccountingDateRangeSchema | | optional
amount | AmountSchema | | optional
amount__gt | AmountGtSchema | | optional
amount__gte | AmountGteSchema | | optional
amount__lt | AmountLtSchema | | optional
amount__lte | AmountLteSchema | | optional
amount__range | AmountRangeSchema | | optional
collected_at | CollectedAtSchema | | optional
collected_at__gt | CollectedAtGtSchema | | optional
collected_at__gte | CollectedAtGteSchema | | optional
collected_at__lt | CollectedAtLtSchema | | optional
collected_at__lte | CollectedAtLteSchema | | optional
collected_at__range | CollectedAtRangeSchema | | optional
created_at | CreatedAtSchema | | optional
created_at__gt | CreatedAtGtSchema | | optional
created_at__gte | CreatedAtGteSchema | | optional
created_at__lt | CreatedAtLtSchema | | optional
created_at__lte | CreatedAtLteSchema | | optional
created_at__range | CreatedAtRangeSchema | | optional
credit_card_data__bill_name__in | CreditCardDataBillNameInSchema | | optional
currency | CurrencySchema | | optional
currency__in | CurrencyInSchema | | optional
reference | ReferenceSchema | | optional
reference__in | ReferenceInSchema | | optional
status | StatusSchema | | optional
status__in | StatusInSchema | | optional
type | TypeSchema | | optional
type__in | TypeInSchema | | optional
value_date | ValueDateSchema | | optional
value_date__gt | ValueDateGtSchema | | optional
value_date__gte | ValueDateGteSchema | | optional
value_date__lt | ValueDateLtSchema | | optional
value_date__lte | ValueDateLteSchema | | optional
value_date__range | ValueDateRangeSchema | | optional


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

# AccountSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, uuid.UUID,  | str,  |  | value must be a uuid

# AccountBalanceAvailableSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceAvailableLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceAvailableLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceAvailableRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceCurrentSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceCurrentGtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceCurrentGteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceCurrentLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceCurrentLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountBalanceCurrentRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountTypeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountTypeInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountingDateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountingDateGtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountingDateGteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountingDateLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountingDateLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AccountingDateRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AmountSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AmountGtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AmountGteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AmountLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AmountLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AmountRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CollectedAtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CollectedAtGtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CollectedAtGteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CollectedAtLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CollectedAtLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CollectedAtRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CreatedAtSchema

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

# CreditCardDataBillNameInSchema

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

# ReferenceSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ReferenceInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# StatusSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# StatusInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# TypeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# TypeInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ValueDateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ValueDateGtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ValueDateGteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ValueDateLtSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ValueDateLteSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ValueDateRangeSchema

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
[**TransactionsPaginatedResponse**](../../models/TransactionsPaginatedResponse.md) |  | 


#### list.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsListResponse**](../../models/TransactionsListResponse.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **retrieve**
<a name="retrieve"></a>
> TransactionsRetrieveResponse retrieve(transactions_request)

Retrieve transactions for a link

Retrieve transactions for one or more accounts from a specific link. <div style=\"background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Info: </strong> When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. <br><br> If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. </div> 

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
        "account": "d4617561-1c01-4b2f-83b6-a594f7b3bc57",
        "date_from": "2020-08-05",
        "date_to": "2020-10-05",
        "token": "1234ab",
        "save_data": True,
    }
try:
    # Retrieve transactions for a link
    retrieve_response = belvo.transactions.retrieve(
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
        header_params = {
            'X-Belvo-Request-Mode': "async",
        },
        body=body
    )
    pprint(retrieve_response.body)
    pprint(retrieve_response.headers)
    pprint(retrieve_response.status)
    pprint(retrieve_response.round_trip_time)
except ApiException as e:
    print("Exception when calling TransactionsApi.retrieve: %s\n" % e)
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
header_params | RequestHeaderParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsRequest**](../../models/TransactionsRequest.md) |  | 


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

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Belvo-Request-Mode | XBelvoRequestModeSchema | | optional

# XBelvoRequestModeSchema

Recommended header parameter to make your POST request to retrieve transactions asynchronous (thus preventing timeouts).  When you make a asynchronous request, Belvo responds with a `202 - Accepted` payload, including the `request_id`. Once we have retrieved the transaction information, you will receive a `new_transactions_available` webhook with the link and request IDs.   **Note**: This parameter is case sensitive (in other words, if you write `ASYNC`, then Belvo will default to a synchronous call). 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | Recommended header parameter to make your POST request to retrieve transactions asynchronous (thus preventing timeouts).  When you make a asynchronous request, Belvo responds with a &#x60;202 - Accepted&#x60; payload, including the &#x60;request_id&#x60;. Once we have retrieved the transaction information, you will receive a &#x60;new_transactions_available&#x60; webhook with the link and request IDs.   **Note**: This parameter is case sensitive (in other words, if you write &#x60;ASYNC&#x60;, then Belvo will default to a synchronous call).  | must be one of ["async", ] 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#retrieve.ApiResponseFor200) | Ok (when &#x60;save_data&#x3D;false&#x60;)
201 | [ApiResponseFor201](#retrieve.ApiResponseFor201) | Created (when &#x60;save_data&#x3D;true&#x60;)
202 | [ApiResponseFor202](#retrieve.ApiResponseFor202) | Accepted (when &#x60;X-Belvo-Request-Mode&#x60; is &#x60;async&#x60;)
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
[**TransactionsRetrieveResponse**](../../models/TransactionsRetrieveResponse.md) |  | 


#### retrieve.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsRetrieve201Response**](../../models/TransactionsRetrieve201Response.md) |  | 


#### retrieve.ApiResponseFor202
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor202ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor202ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AsynchronousAccepted202**](../../models/AsynchronousAccepted202.md) |  | 


#### retrieve.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsRetrieve400Response**](../../models/TransactionsRetrieve400Response.md) |  | 


#### retrieve.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsRetrieve401Response**](../../models/TransactionsRetrieve401Response.md) |  | 


#### retrieve.ApiResponseFor408
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor408ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor408ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsRetrieve408Response**](../../models/TransactionsRetrieve408Response.md) |  | 


#### retrieve.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsRetrieve428Response**](../../models/TransactionsRetrieve428Response.md) |  | 


#### retrieve.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TransactionsRetrieve500Response**](../../models/TransactionsRetrieve500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

