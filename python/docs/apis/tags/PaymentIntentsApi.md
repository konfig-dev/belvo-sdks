<a name="__pageTop"></a>
# belvo_client.apis.tags.payment_intents_api.PaymentIntentsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complete**](#complete) | **patch** /payments/payment-intents/{id} | Complete a payment intent
[**create**](#create) | **post** /payments/payment-intents | Create a new payment intent
[**get_details**](#get_details) | **get** /payments/payment-intents/{id} | Get details about a payment intent.
[**list**](#list) | **get** /payments/payment-intents | List all payment intents

# **complete**
<a name="complete"></a>
> PaymentIntentsCompleteResponse complete(id)

Complete a payment intent

Complete a new payment intent.  During the payment intent flow, you'll need to prompt your customer to provide additional information about their institution, bank account, and login credentials. This is done by sending PATCH calls with the information that Belvo asked you display in each `next_step` object. If you need more information on how to complete a payment intent, check our PSE payment initiation guides for  🇨🇴 Colombia.

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
        "payment_method_details": None,
        "confirm": True,
    }
try:
    # Complete a payment intent
    complete_response = belvo.payment_intents.complete(
        path_params = {
            'id': "a3b92311-1888-449f-acaa-49ae28d68fcd",
        },
        body=body
    )
    pprint(complete_response.body)
    pprint(complete_response.headers)
    pprint(complete_response.status)
    pprint(complete_response.round_trip_time)
except ApiException as e:
    print("Exception when calling PaymentIntentsApi.complete: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PatchPaymentIntentPse**](../../models/PatchPaymentIntentPse.md) |  | 


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
200 | [ApiResponseFor200](#complete.ApiResponseFor200) | OK (Created)
400 | [ApiResponseFor400](#complete.ApiResponseFor400) | Validation Error
404 | [ApiResponseFor404](#complete.ApiResponseFor404) | Not Found Error

#### complete.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsCompleteResponse**](../../models/PaymentIntentsCompleteResponse.md) |  | 


#### complete.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsComplete400Response**](../../models/PaymentIntentsComplete400Response.md) |  | 


#### complete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsComplete404Response**](../../models/PaymentIntentsComplete404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **create**
<a name="create"></a>
> PaymentIntentsCreateResponse create()

Create a new payment intent

Create a payment intent.

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

body = None
try:
    # Create a new payment intent
    create_response = belvo.payment_intents.create(
        body=body
    )
    pprint(create_response.body)
    pprint(create_response.headers)
    pprint(create_response.status)
    pprint(create_response.round_trip_time)
except ApiException as e:
    print("Exception when calling PaymentIntentsApi.create: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsCreateRequest**](../../models/PaymentIntentsCreateRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ApiResponseFor201](#create.ApiResponseFor201) | OK (Created)
400 | [ApiResponseFor400](#create.ApiResponseFor400) | Validation Error
401 | [ApiResponseFor401](#create.ApiResponseFor401) | Authentication Error
408 | [ApiResponseFor408](#create.ApiResponseFor408) | Request Timeout Error
500 | [ApiResponseFor500](#create.ApiResponseFor500) | Unexpected Error

#### create.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsCreateResponse**](../../models/PaymentIntentsCreateResponse.md) |  | 


#### create.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsCreate400Response**](../../models/PaymentIntentsCreate400Response.md) |  | 


#### create.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsCreate401Response**](../../models/PaymentIntentsCreate401Response.md) |  | 


#### create.ApiResponseFor408
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor408ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor408ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsCreate408Response**](../../models/PaymentIntentsCreate408Response.md) |  | 


#### create.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsCreate500Response**](../../models/PaymentIntentsCreate500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_details**
<a name="get_details"></a>
> PaymentIntentsGetDetailsResponse get_details(id)

Get details about a payment intent.

Get the details about a specific payment intent.

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
    # Get details about a payment intent.
    get_details_response = belvo.payment_intents.get_details(
        path_params = {
            'id': "a3b92311-1888-449f-acaa-49ae28d68fcd",
        },
    )
    pprint(get_details_response.body)
    pprint(get_details_response.headers)
    pprint(get_details_response.status)
    pprint(get_details_response.round_trip_time)
except ApiException as e:
    print("Exception when calling PaymentIntentsApi.get_details: %s\n" % e)
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
200 | [ApiResponseFor200](#get_details.ApiResponseFor200) | OK
401 | [ApiResponseFor401](#get_details.ApiResponseFor401) | Authentication Error
404 | [ApiResponseFor404](#get_details.ApiResponseFor404) | Not Found Error

#### get_details.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsGetDetailsResponse**](../../models/PaymentIntentsGetDetailsResponse.md) |  | 


#### get_details.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsGetDetails401Response**](../../models/PaymentIntentsGetDetails401Response.md) |  | 


#### get_details.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsGetDetails404Response**](../../models/PaymentIntentsGetDetails404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list**
<a name="list"></a>
> PaymentIntentPaginatedResponse list()

List all payment intents

List all payment intents associated with your Belvo account.

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
    # List all payment intents
    list_response = belvo.payment_intents.list(
        query_params = {
            'page': 1,
            'id__in': "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
            'created_at': "2022-09-15",
            'created_at__gt': "2022-09-15",
            'created_at__gte': "2022-09-15",
            'created_at__lt': "2022-09-15",
            'created_at__lte': "2022-09-15",
            'created_at__range': "2022-09-15,2022-09-20",
            'provider': "payments_way",
            'payment_method_type': "pse",
            'customer': "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d",
            'customer__in': "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
            'amount': "1000",
            'amount__gt': "1000",
            'amount__gte': "1000",
            'amount__lt': "1000",
            'amount__lte': "1000",
            'status': "SUCCEEDED",
            'status__in': "PROCESSING,SUCCEEDED",
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
    print("Exception when calling PaymentIntentsApi.list: %s\n" % e)
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
id__in | IdInSchema | | optional
created_at | CreatedAtSchema | | optional
created_at__gt | CreatedAtGtSchema | | optional
created_at__gte | CreatedAtGteSchema | | optional
created_at__lt | CreatedAtLtSchema | | optional
created_at__lte | CreatedAtLteSchema | | optional
created_at__range | CreatedAtRangeSchema | | optional
provider | ProviderSchema | | optional
payment_method_type | PaymentMethodTypeSchema | | optional
customer | CustomerSchema | | optional
customer__in | CustomerInSchema | | optional
amount | AmountSchema | | optional
amount__gt | AmountGtSchema | | optional
amount__gte | AmountGteSchema | | optional
amount__lt | AmountLtSchema | | optional
amount__lte | AmountLteSchema | | optional
status | StatusSchema | | optional
status__in | StatusInSchema | | optional


# PageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

# IdInSchema

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

# ProviderSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# PaymentMethodTypeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CustomerSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CustomerInSchema

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

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#list.ApiResponseFor200) | OK
401 | [ApiResponseFor401](#list.ApiResponseFor401) | Authentication Error

#### list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentPaginatedResponse**](../../models/PaymentIntentPaginatedResponse.md) |  | 


#### list.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PaymentIntentsListResponse**](../../models/PaymentIntentsListResponse.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

