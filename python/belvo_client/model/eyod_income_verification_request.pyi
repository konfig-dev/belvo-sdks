# coding: utf-8

"""
    Belvo API Docs

    # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 

    The version of the OpenAPI document: 1.35.0
    Contact: support@belvo.com
    Created by: https://developers.belvo.com
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from belvo_client import schemas  # noqa: F401


class EyodIncomeVerificationRequest(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "language",
            "transactions",
        }
        
        class properties:
            language = schemas.StrSchema
            
            
            class transactions(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['EyodIncomeVerificationBodyRequest']:
                        return EyodIncomeVerificationBodyRequest
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['EyodIncomeVerificationBodyRequest'], typing.List['EyodIncomeVerificationBodyRequest']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'transactions':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'EyodIncomeVerificationBodyRequest':
                    return super().__getitem__(i)
            
            
            class date_from(
                schemas.StrSchema
            ):
                pass
            
            
            class date_to(
                schemas.StrSchema
            ):
                pass
            
            
            class allowed_income_types(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['EnumInvoiceAllowedIncomeTypesRequest']:
                        return EnumInvoiceAllowedIncomeTypesRequest
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['EnumInvoiceAllowedIncomeTypesRequest'], typing.List['EnumInvoiceAllowedIncomeTypesRequest']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'allowed_income_types':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'EnumInvoiceAllowedIncomeTypesRequest':
                    return super().__getitem__(i)
        
            @staticmethod
            def minimum_confidence_level() -> typing.Type['EnumIncomeMinimumConfidenceLevelRequest']:
                return EnumIncomeMinimumConfidenceLevelRequest
            __annotations__ = {
                "language": language,
                "transactions": transactions,
                "date_from": date_from,
                "date_to": date_to,
                "allowed_income_types": allowed_income_types,
                "minimum_confidence_level": minimum_confidence_level,
            }
    
    language: MetaOapg.properties.language
    transactions: MetaOapg.properties.transactions
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["language"]) -> MetaOapg.properties.language: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["transactions"]) -> MetaOapg.properties.transactions: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_from"]) -> MetaOapg.properties.date_from: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date_to"]) -> MetaOapg.properties.date_to: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["allowed_income_types"]) -> MetaOapg.properties.allowed_income_types: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["minimum_confidence_level"]) -> 'EnumIncomeMinimumConfidenceLevelRequest': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["language", "transactions", "date_from", "date_to", "allowed_income_types", "minimum_confidence_level", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["language"]) -> MetaOapg.properties.language: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["transactions"]) -> MetaOapg.properties.transactions: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_from"]) -> typing.Union[MetaOapg.properties.date_from, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date_to"]) -> typing.Union[MetaOapg.properties.date_to, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["allowed_income_types"]) -> typing.Union[MetaOapg.properties.allowed_income_types, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["minimum_confidence_level"]) -> typing.Union['EnumIncomeMinimumConfidenceLevelRequest', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["language", "transactions", "date_from", "date_to", "allowed_income_types", "minimum_confidence_level", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        language: typing.Union[MetaOapg.properties.language, str, ],
        transactions: typing.Union[MetaOapg.properties.transactions, list, tuple, ],
        date_from: typing.Union[MetaOapg.properties.date_from, str, schemas.Unset] = schemas.unset,
        date_to: typing.Union[MetaOapg.properties.date_to, str, schemas.Unset] = schemas.unset,
        allowed_income_types: typing.Union[MetaOapg.properties.allowed_income_types, list, tuple, schemas.Unset] = schemas.unset,
        minimum_confidence_level: typing.Union['EnumIncomeMinimumConfidenceLevelRequest', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'EyodIncomeVerificationRequest':
        return super().__new__(
            cls,
            *args,
            language=language,
            transactions=transactions,
            date_from=date_from,
            date_to=date_to,
            allowed_income_types=allowed_income_types,
            minimum_confidence_level=minimum_confidence_level,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_income_minimum_confidence_level_request import EnumIncomeMinimumConfidenceLevelRequest
from belvo_client.model.enum_invoice_allowed_income_types_request import EnumInvoiceAllowedIncomeTypesRequest
from belvo_client.model.eyod_income_verification_body_request import EyodIncomeVerificationBodyRequest
