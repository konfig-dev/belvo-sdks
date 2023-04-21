<a name="__pageTop"></a>
# belvo_client.apis.tags.risk_insights_api.RiskInsightsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complete_request**](#complete_request) | **patch** /api/risk-insights | Complete a risk insights request
[**delete**](#delete) | **delete** /api/risk-insights/{id} | Delete a risk insight
[**get_details**](#get_details) | **get** /api/risk-insights/{id} | Get a risk insight&#x27;s details
[**list**](#list) | **get** /api/risk-insights | List all risk insights
[**retrieve**](#retrieve) | **post** /api/risk-insights | Retrieve risk insights for a link

# **complete_request**
<a name="complete_request"></a>
> RiskInsightsCompleteRequestResponse complete_request(patch_body)

Complete a risk insights request

Used to resume an Risk insights retrieve session that was paused because an MFA token was required by the institution.

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
    # Complete a risk insights request
    complete_request_response = belvo.risk_insights.complete_request(
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
    print("Exception when calling RiskInsightsApi.complete_request: %s\n" % e)
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
200 | [ApiResponseFor200](#complete_request.ApiResponseFor200) | Ok (when save_data&#x3D;false)
201 | [ApiResponseFor201](#complete_request.ApiResponseFor201) | Created (when save_data&#x3D;true)
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
[**RiskInsightsCompleteRequestResponse**](../../models/RiskInsightsCompleteRequestResponse.md) |  | 


#### complete_request.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsCompleteRequest201Response**](../../models/RiskInsightsCompleteRequest201Response.md) |  | 


#### complete_request.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsCompleteRequest400Response**](../../models/RiskInsightsCompleteRequest400Response.md) |  | 


#### complete_request.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsCompleteRequest401Response**](../../models/RiskInsightsCompleteRequest401Response.md) |  | 


#### complete_request.ApiResponseFor408
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor408ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor408ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsCompleteRequest408Response**](../../models/RiskInsightsCompleteRequest408Response.md) |  | 


#### complete_request.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsCompleteRequest428Response**](../../models/RiskInsightsCompleteRequest428Response.md) |  | 


#### complete_request.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsCompleteRequest500Response**](../../models/RiskInsightsCompleteRequest500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **delete**
<a name="delete"></a>
> delete(id)

Delete a risk insight

Delete a specific risk insight from your Belvo account.

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
    # Delete a risk insight
    belvo.risk_insights.delete(
        path_params = {
            'id': "id_example",
        },
    )
    pprint(delete_response.headers)
    pprint(delete_response.status)
    pprint(delete_response.round_trip_time)
except ApiException as e:
    print("Exception when calling RiskInsightsApi.delete: %s\n" % e)
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
[**RiskInsightsDeleteResponse**](../../models/RiskInsightsDeleteResponse.md) |  | 


#### delete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsDelete404Response**](../../models/RiskInsightsDelete404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_details**
<a name="get_details"></a>
> RiskInsightsGetDetailsResponse get_details(id)

Get a risk insight&#x27;s details

Get the details of a specific risk insight.

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
    # Get a risk insight's details
    get_details_response = belvo.risk_insights.get_details(
        path_params = {
            'id': "id_example",
        },
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
    )
    pprint(get_details_response.body)
    pprint(get_details_response.headers)
    pprint(get_details_response.status)
    pprint(get_details_response.round_trip_time)
except ApiException as e:
    print("Exception when calling RiskInsightsApi.get_details: %s\n" % e)
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
[**RiskInsightsGetDetailsResponse**](../../models/RiskInsightsGetDetailsResponse.md) |  | 


#### get_details.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsGetDetails401Response**](../../models/RiskInsightsGetDetails401Response.md) |  | 


#### get_details.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsGetDetails404Response**](../../models/RiskInsightsGetDetails404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list**
<a name="list"></a>
> RiskInsightsPaginatedResponse list()

List all risk insights

Get a paginated list of all risk insight analyses in your Belvo account. By default, we return up to 100 results per page.

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
    # List all risk insights
    list_response = belvo.risk_insights.list(
        query_params = {
            'page': 1,
            'page_size': 100,
            'omit': "link,balance",
            'fields': "link,balance,account",
            'link': "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
            'id': "eb42c21c-2d9e-4dc1-89b8-9401d4beca73",
            'id__in': "eb42c21c-2d9e-4dc1-89b8-9401d4beca73,82b3f18c-055b-4f82-9fae-d2201815ab0c",
            'link__in': "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65",
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
    print("Exception when calling RiskInsightsApi.list: %s\n" % e)
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
id | IdSchema | | optional
id__in | IdInSchema | | optional
link__in | LinkInSchema | | optional


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

# LinkInSchema

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
[**RiskInsightsPaginatedResponse**](../../models/RiskInsightsPaginatedResponse.md) |  | 


#### list.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsListResponse**](../../models/RiskInsightsListResponse.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **retrieve**
<a name="retrieve"></a>
> RiskInsightsRetrieveResponse retrieve(standard_request)

Retrieve risk insights for a link

Request the risk insights for a given link ID.  If you need to know the currency of the account, just do a GET Details to the accounts endpoint (using the ID you receive from the accounts response).

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
    # Retrieve risk insights for a link
    retrieve_response = belvo.risk_insights.retrieve(
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
    print("Exception when calling RiskInsightsApi.retrieve: %s\n" % e)
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
200 | [ApiResponseFor200](#retrieve.ApiResponseFor200) | Ok (when save_data&#x3D;false)
201 | [ApiResponseFor201](#retrieve.ApiResponseFor201) | Created (when save_data&#x3D;true)
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
[**RiskInsightsRetrieveResponse**](../../models/RiskInsightsRetrieveResponse.md) |  | 


#### retrieve.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsRetrieve201Response**](../../models/RiskInsightsRetrieve201Response.md) |  | 


#### retrieve.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsRetrieve400Response**](../../models/RiskInsightsRetrieve400Response.md) |  | 


#### retrieve.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsRetrieve401Response**](../../models/RiskInsightsRetrieve401Response.md) |  | 


#### retrieve.ApiResponseFor408
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor408ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor408ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsRetrieve408Response**](../../models/RiskInsightsRetrieve408Response.md) |  | 


#### retrieve.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsRetrieve428Response**](../../models/RiskInsightsRetrieve428Response.md) |  | 


#### retrieve.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RiskInsightsRetrieve500Response**](../../models/RiskInsightsRetrieve500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

