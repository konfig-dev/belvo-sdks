<a name="__pageTop"></a>
# belvo_client.apis.tags.links_api.LinksApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**change_access_mode**](#change_access_mode) | **patch** /api/links/{id} | Change a link&#x27;s access mode
[**complete_request**](#complete_request) | **patch** /api/links | Complete a links request
[**destroy**](#destroy) | **delete** /api/links/{id} | Delete a link
[**get_details**](#get_details) | **get** /api/links/{id} | Get a link&#x27;s details
[**list**](#list) | **get** /api/links | List all links
[**register**](#register) | **post** /api/links | Register a new link
[**update**](#update) | **put** /api/links/{id} | Update a link&#x27;s credentials

# **change_access_mode**
<a name="change_access_mode"></a>
> Link change_access_mode(idchange_access_mode)

Change a link&#x27;s access mode

Change a link's access mode from `single` to `recurrent` or from `recurrent` to single. ℹ️ **Note**: When you change a link from `single`` to `recurrent`, they will only be updated the next day at the scheduled interval.

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
        "access_mode": "recurrent",
    }
try:
    # Change a link's access mode
    change_access_mode_response = belvo.links.change_access_mode(
        path_params = {
            'id': "e4bb1afb-4a4f-4dd6-8be0-e615d233185b",
        },
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
        body=body
    )
    pprint(change_access_mode_response.body)
    pprint(change_access_mode_response.body["id"])
    pprint(change_access_mode_response.body["institution"])
    pprint(change_access_mode_response.body["access_mode"])
    pprint(change_access_mode_response.body["last_accessed_at"])
    pprint(change_access_mode_response.body["created_at"])
    pprint(change_access_mode_response.body["external_id"])
    pprint(change_access_mode_response.body["institution_user_id"])
    pprint(change_access_mode_response.body["status"])
    pprint(change_access_mode_response.body["created_by"])
    pprint(change_access_mode_response.body["refresh_rate"])
    pprint(change_access_mode_response.headers)
    pprint(change_access_mode_response.status)
    pprint(change_access_mode_response.round_trip_time)
except ApiException as e:
    print("Exception when calling LinksApi.change_access_mode: %s\n" % e)
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
[**ChangeAccessMode**](../../models/ChangeAccessMode.md) |  | 


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
200 | [ApiResponseFor200](#change_access_mode.ApiResponseFor200) | Ok
400 | [ApiResponseFor400](#change_access_mode.ApiResponseFor400) | Bad request error
401 | [ApiResponseFor401](#change_access_mode.ApiResponseFor401) | Authentication to Belvo API failed
404 | [ApiResponseFor404](#change_access_mode.ApiResponseFor404) | Not Found
428 | [ApiResponseFor428](#change_access_mode.ApiResponseFor428) | MFA Token Required
500 | [ApiResponseFor500](#change_access_mode.ApiResponseFor500) | Unexpected Error

#### change_access_mode.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Link**](../../models/Link.md) |  | 


#### change_access_mode.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksChangeAccessModeResponse**](../../models/LinksChangeAccessModeResponse.md) |  | 


#### change_access_mode.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksChangeAccessMode401Response**](../../models/LinksChangeAccessMode401Response.md) |  | 


#### change_access_mode.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksChangeAccessMode404Response**](../../models/LinksChangeAccessMode404Response.md) |  | 


#### change_access_mode.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksChangeAccessMode428Response**](../../models/LinksChangeAccessMode428Response.md) |  | 


#### change_access_mode.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksChangeAccessMode500Response**](../../models/LinksChangeAccessMode500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **complete_request**
<a name="complete_request"></a>
> Link complete_request(patch_body_without_save_data)

Complete a links request

Used to resume a Link register session that was paused because an MFA token was required by the institution.

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
    }
try:
    # Complete a links request
    complete_request_response = belvo.links.complete_request(
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
        body=body
    )
    pprint(complete_request_response.body)
    pprint(complete_request_response.body["id"])
    pprint(complete_request_response.body["institution"])
    pprint(complete_request_response.body["access_mode"])
    pprint(complete_request_response.body["last_accessed_at"])
    pprint(complete_request_response.body["created_at"])
    pprint(complete_request_response.body["external_id"])
    pprint(complete_request_response.body["institution_user_id"])
    pprint(complete_request_response.body["status"])
    pprint(complete_request_response.body["created_by"])
    pprint(complete_request_response.body["refresh_rate"])
    pprint(complete_request_response.headers)
    pprint(complete_request_response.status)
    pprint(complete_request_response.round_trip_time)
except ApiException as e:
    print("Exception when calling LinksApi.complete_request: %s\n" % e)
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
[**PatchBodyWithoutSaveData**](../../models/PatchBodyWithoutSaveData.md) |  | 


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
200 | [ApiResponseFor200](#complete_request.ApiResponseFor200) | Ok
400 | [ApiResponseFor400](#complete_request.ApiResponseFor400) | Bad request error
401 | [ApiResponseFor401](#complete_request.ApiResponseFor401) | Authentication to Belvo API failed
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
[**Link**](../../models/Link.md) |  | 


#### complete_request.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksCompleteRequestResponse**](../../models/LinksCompleteRequestResponse.md) |  | 


#### complete_request.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksCompleteRequest401Response**](../../models/LinksCompleteRequest401Response.md) |  | 


#### complete_request.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksCompleteRequest428Response**](../../models/LinksCompleteRequest428Response.md) |  | 


#### complete_request.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksCompleteRequest500Response**](../../models/LinksCompleteRequest500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **destroy**
<a name="destroy"></a>
> destroy(id)

Delete a link

Delete a specific link and all associated accounts, transactions, and owners from your Belvo account. # Deleting links in batches To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.    > 🚧 **Rate limiting and IP blocking**   >    > An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.   >    > For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).

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
    # Delete a link
    belvo.links.destroy(
        path_params = {
            'id': "id_example",
        },
    )
    pprint(destroy_response.headers)
    pprint(destroy_response.status)
    pprint(destroy_response.round_trip_time)
except ApiException as e:
    print("Exception when calling LinksApi.destroy: %s\n" % e)
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
204 | [ApiResponseFor204](#destroy.ApiResponseFor204) | No content
401 | [ApiResponseFor401](#destroy.ApiResponseFor401) | Authentication to Belvo API failed
404 | [ApiResponseFor404](#destroy.ApiResponseFor404) | Not Found

#### destroy.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### destroy.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksDestroyResponse**](../../models/LinksDestroyResponse.md) |  | 


#### destroy.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksDestroy404Response**](../../models/LinksDestroy404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **get_details**
<a name="get_details"></a>
> Link get_details(id)

Get a link&#x27;s details

Get the details of a specific link.

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
    # Get a link's details
    get_details_response = belvo.links.get_details(
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
    pprint(get_details_response.body["institution"])
    pprint(get_details_response.body["access_mode"])
    pprint(get_details_response.body["last_accessed_at"])
    pprint(get_details_response.body["created_at"])
    pprint(get_details_response.body["external_id"])
    pprint(get_details_response.body["institution_user_id"])
    pprint(get_details_response.body["status"])
    pprint(get_details_response.body["created_by"])
    pprint(get_details_response.body["refresh_rate"])
    pprint(get_details_response.headers)
    pprint(get_details_response.status)
    pprint(get_details_response.round_trip_time)
except ApiException as e:
    print("Exception when calling LinksApi.get_details: %s\n" % e)
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
[**Link**](../../models/Link.md) |  | 


#### get_details.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksGetDetailsResponse**](../../models/LinksGetDetailsResponse.md) |  | 


#### get_details.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksGetDetails404Response**](../../models/LinksGetDetails404Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **list**
<a name="list"></a>
> PaginatedResponseLink list()

List all links

Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.

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
    # List all links
    list_response = belvo.links.list(
        query_params = {
            'page': 1,
            'page_size': 100,
            'omit': "link,balance",
            'fields': "link,balance,account",
            'access_mode': "single",
            'created_at': "2022-05-01",
            'created_at__gt': "2022-05-05",
            'created_at__gte': "2022-05-04",
            'created_at__lt': "2022-04-01",
            'created_at__lte': "2022-03-30",
            'created_at__range': "2022-03-03,2022-05-04",
            'created_by__not_in': "578947e2-3c9a-4401-bbad-59b2f2d2b91b,d3d941ab-4ca5-43c1-8b23-db329ee4cb7e",
            'external_id': "InternalUser4000",
            'external_id__in': "InternalUser4000,InternalUser4001",
            'id': "73694155-b871-41ec-94e3-37d17ff62b5d",
            'id__in': "73694155-b871-41ec-94e3-37d17ff62b5d,40968d42-7d89-49e3-9931-78baa8e0544e",
            'institution': "erebor_mx_retail",
            'institution__in': "erebor_mx_retail,gringotts_co_retail",
            'institution_user_id': "ezFoxjPDr7YnASnOaft5F3zt7D0kurgDNlLtZFjxUo0=",
            'institution_user_id__in': "ezFoxjPDr7YnASnOaft5F3zt7D0kurgDNlLtZFjxUo0=,YwuTM0uEEh1BbVgDZBcNpa_-Tm3l2q8ZkZNrlhp-pNA=",
            'refresh_rate': "24h",
            'status': "invalid",
            'status__in': "invalid,unconfirmed",
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
    print("Exception when calling LinksApi.list: %s\n" % e)
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
access_mode | AccessModeSchema | | optional
created_at | CreatedAtSchema | | optional
created_at__gt | CreatedAtGtSchema | | optional
created_at__gte | CreatedAtGteSchema | | optional
created_at__lt | CreatedAtLtSchema | | optional
created_at__lte | CreatedAtLteSchema | | optional
created_at__range | CreatedAtRangeSchema | | optional
created_by__not_in | CreatedByNotInSchema | | optional
external_id | ExternalIdSchema | | optional
external_id__in | ExternalIdInSchema | | optional
id | IdSchema | | optional
id__in | IdInSchema | | optional
institution | InstitutionSchema | | optional
institution__in | InstitutionInSchema | | optional
institution_user_id | InstitutionUserIdSchema | | optional
institution_user_id__in | InstitutionUserIdInSchema | | optional
refresh_rate | RefreshRateSchema | | optional
status | StatusSchema | | optional
status__in | StatusInSchema | | optional


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

# AccessModeSchema

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

# CreatedByNotInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ExternalIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ExternalIdInSchema

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

# InstitutionUserIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# InstitutionUserIdInSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# RefreshRateSchema

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
[**PaginatedResponseLink**](../../models/PaginatedResponseLink.md) |  | 


#### list.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksListResponse**](../../models/LinksListResponse.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **register**
<a name="register"></a>
> Link register(links_request)

Register a new link

Register a new link with your Belvo account.  <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle link creation and link status updates. </div> 

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
        "institution": "erebor_mx_retail",
        "username": "username",
        "password": "password",
        "external_id": "56ab5706-6e00-48a4-91c9-ca55968678d9",
        "username2": "secondusername",
        "username3": "thirdusername",
        "password2": "pin",
        "token": "1234ab",
        "access_mode": "recurrent",
        "fetch_historical": True,
        "credentials_storage": "store",
        "username_type": "001",
        "certificate": "1234567890abcd=",
        "private_key": "1234567890abcd=",
    }
try:
    # Register a new link
    register_response = belvo.links.register(
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
        body=body
    )
    pprint(register_response.body)
    pprint(register_response.body["id"])
    pprint(register_response.body["institution"])
    pprint(register_response.body["access_mode"])
    pprint(register_response.body["last_accessed_at"])
    pprint(register_response.body["created_at"])
    pprint(register_response.body["external_id"])
    pprint(register_response.body["institution_user_id"])
    pprint(register_response.body["status"])
    pprint(register_response.body["created_by"])
    pprint(register_response.body["refresh_rate"])
    pprint(register_response.headers)
    pprint(register_response.status)
    pprint(register_response.round_trip_time)
except ApiException as e:
    print("Exception when calling LinksApi.register: %s\n" % e)
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
[**LinksRequest**](../../models/LinksRequest.md) |  | 


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
201 | [ApiResponseFor201](#register.ApiResponseFor201) | Created
400 | [ApiResponseFor400](#register.ApiResponseFor400) | Bad request error
401 | [ApiResponseFor401](#register.ApiResponseFor401) | Authentication to Belvo API failed
428 | [ApiResponseFor428](#register.ApiResponseFor428) | MFA Token Required
500 | [ApiResponseFor500](#register.ApiResponseFor500) | Unexpected Error

#### register.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Link**](../../models/Link.md) |  | 


#### register.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksRegisterResponse**](../../models/LinksRegisterResponse.md) |  | 


#### register.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksRegister401Response**](../../models/LinksRegister401Response.md) |  | 


#### register.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksRegister428Response**](../../models/LinksRegister428Response.md) |  | 


#### register.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksRegister500Response**](../../models/LinksRegister500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **update**
<a name="update"></a>
> Link update(idlinks_put_request)

Update a link&#x27;s credentials

Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you'll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> We recommend using our <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">Connect Widget</a> to handle updating <code>invalid</code> or <code>token_required</code> links. </div> 

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
        "password": "password",
        "password2": "pin",
        "token": "1234ab",
        "username_type": "001",
        "certificate": "1234567890abcd=",
        "private_key": "1234567890abcd=",
    }
try:
    # Update a link's credentials
    update_response = belvo.links.update(
        path_params = {
            'id': "id_example",
        },
        query_params = {
            'omit': "link,balance",
            'fields': "link,balance,account",
        },
        body=body
    )
    pprint(update_response.body)
    pprint(update_response.body["id"])
    pprint(update_response.body["institution"])
    pprint(update_response.body["access_mode"])
    pprint(update_response.body["last_accessed_at"])
    pprint(update_response.body["created_at"])
    pprint(update_response.body["external_id"])
    pprint(update_response.body["institution_user_id"])
    pprint(update_response.body["status"])
    pprint(update_response.body["created_by"])
    pprint(update_response.body["refresh_rate"])
    pprint(update_response.headers)
    pprint(update_response.status)
    pprint(update_response.round_trip_time)
except ApiException as e:
    print("Exception when calling LinksApi.update: %s\n" % e)
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
[**LinksPutRequest**](../../models/LinksPutRequest.md) |  | 


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
200 | [ApiResponseFor200](#update.ApiResponseFor200) | Ok
400 | [ApiResponseFor400](#update.ApiResponseFor400) | Bad request error
401 | [ApiResponseFor401](#update.ApiResponseFor401) | Authentication to Belvo API failed
404 | [ApiResponseFor404](#update.ApiResponseFor404) | Not Found
428 | [ApiResponseFor428](#update.ApiResponseFor428) | MFA Token Required
500 | [ApiResponseFor500](#update.ApiResponseFor500) | Unexpected Error

#### update.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Link**](../../models/Link.md) |  | 


#### update.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksUpdateResponse**](../../models/LinksUpdateResponse.md) |  | 


#### update.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksUpdate401Response**](../../models/LinksUpdate401Response.md) |  | 


#### update.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksUpdate404Response**](../../models/LinksUpdate404Response.md) |  | 


#### update.ApiResponseFor428
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor428ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor428ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksUpdate428Response**](../../models/LinksUpdate428Response.md) |  | 


#### update.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LinksUpdate500Response**](../../models/LinksUpdate500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

