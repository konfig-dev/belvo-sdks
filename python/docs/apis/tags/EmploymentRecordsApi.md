<a name="__pageTop"></a>
# belvo_client.apis.tags.employment_records_api.EmploymentRecordsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](#delete) | **delete** /api/employment-records/{id} | Delete an employment record
[**get_details**](#get_details) | **get** /api/employment-records/{id} | Get an employment record&#x27;s details
[**list**](#list) | **get** /api/employment-records | List all employment records
[**retrieve**](#retrieve) | **post** /api/employment-records | Retrieve employment record details

# **delete**
<a name="delete"></a>
> delete(id)

Delete an employment record

Delete a specific employment record from your Belvo account.

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
    # Delete an employment record
    belvo.employment_records.delete(
        path_params = {
            'id': "id_example",
        },
    )
    pprint(delete_response.headers)
    pprint(delete_response.status)
    pprint(delete_response.round_trip_time)
except ApiException as e:
    print("Exception when calling EmploymentRecordsApi.delete: %s\n" % e)
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
[**EmploymentRecordsDeleteResponse**](../../models/EmploymentRecordsDeleteResponse.md) |  | 


#### delete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsDelete404Response**](../../models/EmploymentRecordsDelete404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_details**
<a name="get_details"></a>
> EmploymentRecord get_details(id)

Get an employment record&#x27;s details

Get the details of a specific employment record.

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
    # Get an employment record's details
    get_details_response = belvo.employment_records.get_details(
        path_params = {
            'id': "id_example",
        },
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
    )
    pprint(get_details_response.body)
    pprint(get_details_response.body["id"])
    pprint(get_details_response.body["link"])
    pprint(get_details_response.body["created_at"])
    pprint(get_details_response.body["collected_at"])
    pprint(get_details_response.body["report_date"])
    pprint(get_details_response.body["internal_identification"])
    pprint(get_details_response.body["personal_data"])
    pprint(get_details_response.body["social_security_summary"])
    pprint(get_details_response.body["employment_records"])
    pprint(get_details_response.body["files"])
    pprint(get_details_response.headers)
    pprint(get_details_response.status)
    pprint(get_details_response.round_trip_time)
except ApiException as e:
    print("Exception when calling EmploymentRecordsApi.get_details: %s\n" % e)
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
[**EmploymentRecord**](../../models/EmploymentRecord.md) |  | 


#### get_details.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsGetDetailsResponse**](../../models/EmploymentRecordsGetDetailsResponse.md) |  | 


#### get_details.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsGetDetails404Response**](../../models/EmploymentRecordsGetDetails404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list**
<a name="list"></a>
> EmploymentRecordsPaginatedResponse list()

List all employment records

Get a paginated list of all existing employment records in your Belvo account. By default, we return up to 100 results per page.

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
    # List all employment records
    list_response = belvo.employment_records.list(
        query_params = {
            'page': 1,
            'page_size': 100,
            'omit': "link,balance",
            'fields': "link,balance,account",
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
    print("Exception when calling EmploymentRecordsApi.list: %s\n" % e)
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
[**EmploymentRecordsPaginatedResponse**](../../models/EmploymentRecordsPaginatedResponse.md) |  | 


#### list.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsListResponse**](../../models/EmploymentRecordsListResponse.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **retrieve**
<a name="retrieve"></a>
> EmploymentRecordsRetrieveResponse retrieve(employment_record_request)

Retrieve employment record details

Retrieve employment record details for an individual. 

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
        "link": "d686c617-6d9e-4bc6-9801-5ac276ccb6a2",
        "attach_pdf": False,
        "save_data": True,
    }
try:
    # Retrieve employment record details
    retrieve_response = belvo.employment_records.retrieve(
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
    print("Exception when calling EmploymentRecordsApi.retrieve: %s\n" % e)
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
[**EmploymentRecordRequest**](../../models/EmploymentRecordRequest.md) |  | 


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
200 | [ApiResponseFor200](#retrieve.ApiResponseFor200) | Ok
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
[**EmploymentRecordsRetrieveResponse**](../../models/EmploymentRecordsRetrieveResponse.md) |  | 


#### retrieve.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsRetrieve201Response**](../../models/EmploymentRecordsRetrieve201Response.md) |  | 


#### retrieve.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsRetrieve400Response**](../../models/EmploymentRecordsRetrieve400Response.md) |  | 


#### retrieve.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsRetrieve401Response**](../../models/EmploymentRecordsRetrieve401Response.md) |  | 


#### retrieve.ApiResponseFor408
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor408ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor408ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsRetrieve408Response**](../../models/EmploymentRecordsRetrieve408Response.md) |  | 


#### retrieve.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsRetrieve428Response**](../../models/EmploymentRecordsRetrieve428Response.md) |  | 


#### retrieve.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EmploymentRecordsRetrieve500Response**](../../models/EmploymentRecordsRetrieve500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

