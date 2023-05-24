<a name="__pageTop"></a>
# belvo_client.apis.tags.income_verification_api.IncomeVerificationApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verify**](#verify) | **post** /api/enrich/incomes | Verify incomes

# **verify**

Verify incomes

Send through your raw data and receive enriched information for each of your user's income streams.  <div style=\"background-color:#f4f6f8; border-left: 6px solid #5bc0de;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\"> <strong>Note: </strong> Belvo can process up to 10,000 unique transactions per request. </div>

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
    # Verify incomes
    verify_response = belvo.income_verification.verify(
        language="pt",  # required
        transactions=[
            {
                "description": "SALÁRIO MENSAL",
                "transaction_id": "3CWE4927CF15355",
                "account_holder_type": "INDIVIDUAL",
                "account_holder_id": "a61bc801-9fa5-457b-88ad-850c96eaca30",
                "account_id": "EBACA-89077589",
                "account_category": "CHECKING_ACCOUNT",
                "value_date": "2022-11-18",
                "type": "INFLOW",
                "amount": 650.89,
                "currency": "BRL",
                "institution": "Erebor Brazil",
            }
        ],  # required
        date_from="2022-08-01",  # optional
        date_to="2022-12-30",  # optional
        allowed_income_types=["string_example"],  # optional
        minimum_confidence_level="HIGH",  # optional
    )
    pprint(verify_response.body)
    pprint(verify_response.headers)
    pprint(verify_response.status)
    pprint(verify_response.round_trip_time)
except ApiException as e:
    print("Exception when calling IncomeVerificationApi.verify: %s\n" % e)
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
[**EyodIncomeVerificationRequest**](../../models/EyodIncomeVerificationRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#verify.ApiResponseFor200) | Ok
400 | [ApiResponseFor400](#verify.ApiResponseFor400) | Bad request error
401 | [ApiResponseFor401](#verify.ApiResponseFor401) | Authentication to Belvo API failed
403 | [ApiResponseFor403](#verify.ApiResponseFor403) | Access to Belvo API denied
500 | [ApiResponseFor500](#verify.ApiResponseFor500) | Unexpected Error

#### verify.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IncomeVerificationVerifyResponse**](../../models/IncomeVerificationVerifyResponse.md) |  | 


#### verify.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IncomeVerificationVerify400Response**](../../models/IncomeVerificationVerify400Response.md) |  | 


#### verify.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IncomeVerificationVerify401Response**](../../models/IncomeVerificationVerify401Response.md) |  | 


#### verify.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IncomeVerificationVerify403Response**](../../models/IncomeVerificationVerify403Response.md) |  | 


#### verify.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IncomeVerificationVerify500Response**](../../models/IncomeVerificationVerify500Response.md) |  | 


### Authorization

[basicAuth](../../../README.md#basicAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

