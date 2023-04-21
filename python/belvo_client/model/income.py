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


class Income(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Income insights
    """


    class MetaOapg:
        required = {
            "monthly_average",
            "monthly_average_regular",
            "total_medium_confidence",
            "monthly_average_irregular",
            "number_of_income_streams",
            "total_income_amount",
            "monthly_average_high_confidence",
            "total_high_confidence",
            "income_source_type",
            "link",
            "created_at",
            "first_transaction_date",
            "monthly_average_low_confidence",
            "last_transaction_date",
            "total_regular_income_amount",
            "institution",
            "total_low_confidence",
            "monthly_average_medium_confidence",
            "income_streams",
            "id",
        }
        
        class properties:
            id = schemas.UUIDSchema
            link = schemas.UUIDSchema
            created_at = schemas.DateTimeSchema
            
            
            class income_streams(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['IncomeStreamsBody']:
                        return IncomeStreamsBody
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['IncomeStreamsBody'], typing.List['IncomeStreamsBody']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'income_streams':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'IncomeStreamsBody':
                    return super().__getitem__(i)
            institution = schemas.StrSchema
        
            @staticmethod
            def income_source_type() -> typing.Type['EnumIncomeSourceType']:
                return EnumIncomeSourceType
            
            
            class first_transaction_date(
                schemas.DateBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'date'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, date, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'first_transaction_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            last_transaction_date = schemas.DateSchema
            number_of_income_streams = schemas.Int32Schema
            monthly_average = schemas.Float32Schema
            monthly_average_regular = schemas.Float32Schema
            monthly_average_irregular = schemas.Float32Schema
            monthly_average_low_confidence = schemas.Float32Schema
            monthly_average_medium_confidence = schemas.Float32Schema
            monthly_average_high_confidence = schemas.Float32Schema
            total_income_amount = schemas.Float32Schema
            total_regular_income_amount = schemas.Float32Schema
            total_low_confidence = schemas.Float32Schema
            total_medium_confidence = schemas.Float32Schema
            total_high_confidence = schemas.Float32Schema
            total_irregular_income_amount = schemas.Float32Schema
            __annotations__ = {
                "id": id,
                "link": link,
                "created_at": created_at,
                "income_streams": income_streams,
                "institution": institution,
                "income_source_type": income_source_type,
                "first_transaction_date": first_transaction_date,
                "last_transaction_date": last_transaction_date,
                "number_of_income_streams": number_of_income_streams,
                "monthly_average": monthly_average,
                "monthly_average_regular": monthly_average_regular,
                "monthly_average_irregular": monthly_average_irregular,
                "monthly_average_low_confidence": monthly_average_low_confidence,
                "monthly_average_medium_confidence": monthly_average_medium_confidence,
                "monthly_average_high_confidence": monthly_average_high_confidence,
                "total_income_amount": total_income_amount,
                "total_regular_income_amount": total_regular_income_amount,
                "total_low_confidence": total_low_confidence,
                "total_medium_confidence": total_medium_confidence,
                "total_high_confidence": total_high_confidence,
                "total_irregular_income_amount": total_irregular_income_amount,
            }
    
    monthly_average: MetaOapg.properties.monthly_average
    monthly_average_regular: MetaOapg.properties.monthly_average_regular
    total_medium_confidence: MetaOapg.properties.total_medium_confidence
    monthly_average_irregular: MetaOapg.properties.monthly_average_irregular
    number_of_income_streams: MetaOapg.properties.number_of_income_streams
    total_income_amount: MetaOapg.properties.total_income_amount
    monthly_average_high_confidence: MetaOapg.properties.monthly_average_high_confidence
    total_high_confidence: MetaOapg.properties.total_high_confidence
    income_source_type: 'EnumIncomeSourceType'
    link: MetaOapg.properties.link
    created_at: MetaOapg.properties.created_at
    first_transaction_date: MetaOapg.properties.first_transaction_date
    monthly_average_low_confidence: MetaOapg.properties.monthly_average_low_confidence
    last_transaction_date: MetaOapg.properties.last_transaction_date
    total_regular_income_amount: MetaOapg.properties.total_regular_income_amount
    institution: MetaOapg.properties.institution
    total_low_confidence: MetaOapg.properties.total_low_confidence
    monthly_average_medium_confidence: MetaOapg.properties.monthly_average_medium_confidence
    income_streams: MetaOapg.properties.income_streams
    id: MetaOapg.properties.id
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["income_streams"]) -> MetaOapg.properties.income_streams: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["institution"]) -> MetaOapg.properties.institution: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["income_source_type"]) -> 'EnumIncomeSourceType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["first_transaction_date"]) -> MetaOapg.properties.first_transaction_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_transaction_date"]) -> MetaOapg.properties.last_transaction_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_of_income_streams"]) -> MetaOapg.properties.number_of_income_streams: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["monthly_average"]) -> MetaOapg.properties.monthly_average: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["monthly_average_regular"]) -> MetaOapg.properties.monthly_average_regular: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["monthly_average_irregular"]) -> MetaOapg.properties.monthly_average_irregular: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["monthly_average_low_confidence"]) -> MetaOapg.properties.monthly_average_low_confidence: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["monthly_average_medium_confidence"]) -> MetaOapg.properties.monthly_average_medium_confidence: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["monthly_average_high_confidence"]) -> MetaOapg.properties.monthly_average_high_confidence: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_income_amount"]) -> MetaOapg.properties.total_income_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_regular_income_amount"]) -> MetaOapg.properties.total_regular_income_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_low_confidence"]) -> MetaOapg.properties.total_low_confidence: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_medium_confidence"]) -> MetaOapg.properties.total_medium_confidence: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_high_confidence"]) -> MetaOapg.properties.total_high_confidence: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_irregular_income_amount"]) -> MetaOapg.properties.total_irregular_income_amount: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "link", "created_at", "income_streams", "institution", "income_source_type", "first_transaction_date", "last_transaction_date", "number_of_income_streams", "monthly_average", "monthly_average_regular", "monthly_average_irregular", "monthly_average_low_confidence", "monthly_average_medium_confidence", "monthly_average_high_confidence", "total_income_amount", "total_regular_income_amount", "total_low_confidence", "total_medium_confidence", "total_high_confidence", "total_irregular_income_amount", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["income_streams"]) -> MetaOapg.properties.income_streams: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["institution"]) -> MetaOapg.properties.institution: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["income_source_type"]) -> 'EnumIncomeSourceType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["first_transaction_date"]) -> MetaOapg.properties.first_transaction_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_transaction_date"]) -> MetaOapg.properties.last_transaction_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number_of_income_streams"]) -> MetaOapg.properties.number_of_income_streams: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["monthly_average"]) -> MetaOapg.properties.monthly_average: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["monthly_average_regular"]) -> MetaOapg.properties.monthly_average_regular: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["monthly_average_irregular"]) -> MetaOapg.properties.monthly_average_irregular: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["monthly_average_low_confidence"]) -> MetaOapg.properties.monthly_average_low_confidence: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["monthly_average_medium_confidence"]) -> MetaOapg.properties.monthly_average_medium_confidence: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["monthly_average_high_confidence"]) -> MetaOapg.properties.monthly_average_high_confidence: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_income_amount"]) -> MetaOapg.properties.total_income_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_regular_income_amount"]) -> MetaOapg.properties.total_regular_income_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_low_confidence"]) -> MetaOapg.properties.total_low_confidence: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_medium_confidence"]) -> MetaOapg.properties.total_medium_confidence: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_high_confidence"]) -> MetaOapg.properties.total_high_confidence: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_irregular_income_amount"]) -> typing.Union[MetaOapg.properties.total_irregular_income_amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "link", "created_at", "income_streams", "institution", "income_source_type", "first_transaction_date", "last_transaction_date", "number_of_income_streams", "monthly_average", "monthly_average_regular", "monthly_average_irregular", "monthly_average_low_confidence", "monthly_average_medium_confidence", "monthly_average_high_confidence", "total_income_amount", "total_regular_income_amount", "total_low_confidence", "total_medium_confidence", "total_high_confidence", "total_irregular_income_amount", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        monthly_average: typing.Union[MetaOapg.properties.monthly_average, decimal.Decimal, int, float, ],
        monthly_average_regular: typing.Union[MetaOapg.properties.monthly_average_regular, decimal.Decimal, int, float, ],
        total_medium_confidence: typing.Union[MetaOapg.properties.total_medium_confidence, decimal.Decimal, int, float, ],
        monthly_average_irregular: typing.Union[MetaOapg.properties.monthly_average_irregular, decimal.Decimal, int, float, ],
        number_of_income_streams: typing.Union[MetaOapg.properties.number_of_income_streams, decimal.Decimal, int, ],
        total_income_amount: typing.Union[MetaOapg.properties.total_income_amount, decimal.Decimal, int, float, ],
        monthly_average_high_confidence: typing.Union[MetaOapg.properties.monthly_average_high_confidence, decimal.Decimal, int, float, ],
        total_high_confidence: typing.Union[MetaOapg.properties.total_high_confidence, decimal.Decimal, int, float, ],
        income_source_type: 'EnumIncomeSourceType',
        link: typing.Union[MetaOapg.properties.link, str, uuid.UUID, ],
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, ],
        first_transaction_date: typing.Union[MetaOapg.properties.first_transaction_date, None, str, date, ],
        monthly_average_low_confidence: typing.Union[MetaOapg.properties.monthly_average_low_confidence, decimal.Decimal, int, float, ],
        last_transaction_date: typing.Union[MetaOapg.properties.last_transaction_date, str, date, ],
        total_regular_income_amount: typing.Union[MetaOapg.properties.total_regular_income_amount, decimal.Decimal, int, float, ],
        institution: typing.Union[MetaOapg.properties.institution, str, ],
        total_low_confidence: typing.Union[MetaOapg.properties.total_low_confidence, decimal.Decimal, int, float, ],
        monthly_average_medium_confidence: typing.Union[MetaOapg.properties.monthly_average_medium_confidence, decimal.Decimal, int, float, ],
        income_streams: typing.Union[MetaOapg.properties.income_streams, list, tuple, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, ],
        total_irregular_income_amount: typing.Union[MetaOapg.properties.total_irregular_income_amount, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Income':
        return super().__new__(
            cls,
            *args,
            monthly_average=monthly_average,
            monthly_average_regular=monthly_average_regular,
            total_medium_confidence=total_medium_confidence,
            monthly_average_irregular=monthly_average_irregular,
            number_of_income_streams=number_of_income_streams,
            total_income_amount=total_income_amount,
            monthly_average_high_confidence=monthly_average_high_confidence,
            total_high_confidence=total_high_confidence,
            income_source_type=income_source_type,
            link=link,
            created_at=created_at,
            first_transaction_date=first_transaction_date,
            monthly_average_low_confidence=monthly_average_low_confidence,
            last_transaction_date=last_transaction_date,
            total_regular_income_amount=total_regular_income_amount,
            institution=institution,
            total_low_confidence=total_low_confidence,
            monthly_average_medium_confidence=monthly_average_medium_confidence,
            income_streams=income_streams,
            id=id,
            total_irregular_income_amount=total_irregular_income_amount,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_income_source_type import EnumIncomeSourceType
from belvo_client.model.income_streams_body import IncomeStreamsBody
