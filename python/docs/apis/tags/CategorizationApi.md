<a name="__pageTop"></a>
# belvo_client.apis.tags.categorization_api.CategorizationApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categorize_transactions**](#categorize_transactions) | **post** /api/categorization | Categorize transactions

# **categorize_transactions**

Categorize transactions

Send through your raw transaction data and receive enriched information for each of your transactions.  <div style=\"background-color:#f4f6f8; border-left: 6px solid #5bc0de;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> Belvo can process up to 10,000 unique transactions per request. </div>

### Example

```python
from pprint import pprint
from belvo_client import Belvo, ApiException

belvo = Belvo(
    # Defining the host is optional and defaults to https://sandbox.belvo.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://sandbox.belvo.com",
    # Configure HTTP basic authorization: basicAuth
    username="YOUR_USERNAME",
    password="YOUR_PASSWORD",
)

try:
    # Categorize transactions
    categorize_transactions_response = belvo.categorization.categorize_transactions(
        language="pt",  # required
        transactions=[
            {
                "description": "APPL3STORE",
                "transaction_id": "3CWE4927CF15355",
                "account_holder_type": "INDIVIDUAL",
                "account_holder_id": "7890098789087",
                "account_id": "BBVACA-89077589",
                "account_category": "CREDIT_CARD",
                "value_date": "2022-11-18",
                "type": "OUTFLOW",
                "amount": 650.89,
                "currency": "BRL",
                "institution": "BBVA",
                "mcc": 2345,
            }
        ],  # required
    )
    pprint(categorize_transactions_response.body)
    pprint(categorize_transactions_response.body["transactions"])
    pprint(categorize_transactions_response.headers)
    pprint(categorize_transactions_response.status)
    pprint(categorize_transactions_response.round_trip_time)
except ApiException as e:
    print("Exception when calling CategorizationApi.categorize_transactions: %s\n" % e)
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
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CategorizationRequest**](../../models/CategorizationRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#categorize_transactions.ApiResponseFor200) | Ok
400 | [ApiResponseFor400](#categorize_transactions.ApiResponseFor400) | Bad request error
401 | [ApiResponseFor401](#categorize_transactions.ApiResponseFor401) | Authentication to Belvo API failed
403 | [ApiResponseFor403](#categorize_transactions.ApiResponseFor403) | Access to Belvo API denied
500 | [ApiResponseFor500](#categorize_transactions.ApiResponseFor500) | Unexpected Error

#### categorize_transactions.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Categorization**](../../models/Categorization.md) |  | 


#### categorize_transactions.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CategorizationCategorizeTransactionsResponse**](../../models/CategorizationCategorizeTransactionsResponse.md) |  | 


#### categorize_transactions.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CategorizationCategorizeTransactions401Response**](../../models/CategorizationCategorizeTransactions401Response.md) |  | 


#### categorize_transactions.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CategorizationCategorizeTransactions403Response**](../../models/CategorizationCategorizeTransactions403Response.md) |  | 


#### categorize_transactions.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CategorizationCategorizeTransactions500Response**](../../models/CategorizationCategorizeTransactions500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

