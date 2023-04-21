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


class IncomeStreamsBody(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    A list of income streams for the account.

For each income stream, we provide additional insights such as:
- Frequency, stability, and confidence level of the income transactions.
- Key metrics about the transaction amounts.
ℹ️ If no income sources are found, we return an empty array.

    """


    class MetaOapg:
        required = {
            "monthly_average",
            "full_periods",
            "last_income_date",
            "average_income_amount",
            "number_of_incomes",
            "trend",
            "lookback_periods",
            "confidence",
            "last_income_amount",
            "regularity",
            "frequency",
            "last_income_description",
            "periods_with_income",
            "account_id",
            "income_type",
            "currency",
            "stability",
        }
        
        class properties:
            account_id = schemas.StrSchema
        
            @staticmethod
            def income_type() -> typing.Type['EnumIncomeStreamType']:
                return EnumIncomeStreamType
        
            @staticmethod
            def frequency() -> typing.Type['EnumIncomeStreamFrequency']:
                return EnumIncomeStreamFrequency
            monthly_average = schemas.Float32Schema
            average_income_amount = schemas.Float32Schema
            last_income_amount = schemas.Float32Schema
            currency = schemas.StrSchema
            
            
            class last_income_description(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    format = 'string'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'last_income_description':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            last_income_date = schemas.DateSchema
            
            
            class stability(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'stability':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class regularity(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'regularity':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class trend(
                schemas.Float32Base,
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'trend':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            lookback_periods = schemas.Int32Schema
            full_periods = schemas.Int32Schema
            periods_with_income = schemas.Int32Schema
            number_of_incomes = schemas.Int32Schema
        
            @staticmethod
            def confidence() -> typing.Type['EnumIncomeStreamConfidence']:
                return EnumIncomeStreamConfidence
            __annotations__ = {
                "account_id": account_id,
                "income_type": income_type,
                "frequency": frequency,
                "monthly_average": monthly_average,
                "average_income_amount": average_income_amount,
                "last_income_amount": last_income_amount,
                "currency": currency,
                "last_income_description": last_income_description,
                "last_income_date": last_income_date,
                "stability": stability,
                "regularity": regularity,
                "trend": trend,
                "lookback_periods": lookback_periods,
                "full_periods": full_periods,
                "periods_with_income": periods_with_income,
                "number_of_incomes": number_of_incomes,
                "confidence": confidence,
            }
    
    monthly_average: MetaOapg.properties.monthly_average
    full_periods: MetaOapg.properties.full_periods
    last_income_date: MetaOapg.properties.last_income_date
    average_income_amount: MetaOapg.properties.average_income_amount
    number_of_incomes: MetaOapg.properties.number_of_incomes
    trend: MetaOapg.properties.trend
    lookback_periods: MetaOapg.properties.lookback_periods
    confidence: 'EnumIncomeStreamConfidence'
    last_income_amount: MetaOapg.properties.last_income_amount
    regularity: MetaOapg.properties.regularity
    frequency: 'EnumIncomeStreamFrequency'
    last_income_description: MetaOapg.properties.last_income_description
    periods_with_income: MetaOapg.properties.periods_with_income
    account_id: MetaOapg.properties.account_id
    income_type: 'EnumIncomeStreamType'
    currency: MetaOapg.properties.currency
    stability: MetaOapg.properties.stability
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account_id"]) -> MetaOapg.properties.account_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["income_type"]) -> 'EnumIncomeStreamType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["frequency"]) -> 'EnumIncomeStreamFrequency': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["monthly_average"]) -> MetaOapg.properties.monthly_average: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["average_income_amount"]) -> MetaOapg.properties.average_income_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_income_amount"]) -> MetaOapg.properties.last_income_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_income_description"]) -> MetaOapg.properties.last_income_description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_income_date"]) -> MetaOapg.properties.last_income_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["stability"]) -> MetaOapg.properties.stability: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["regularity"]) -> MetaOapg.properties.regularity: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["trend"]) -> MetaOapg.properties.trend: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lookback_periods"]) -> MetaOapg.properties.lookback_periods: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["full_periods"]) -> MetaOapg.properties.full_periods: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["periods_with_income"]) -> MetaOapg.properties.periods_with_income: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_of_incomes"]) -> MetaOapg.properties.number_of_incomes: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["confidence"]) -> 'EnumIncomeStreamConfidence': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["account_id", "income_type", "frequency", "monthly_average", "average_income_amount", "last_income_amount", "currency", "last_income_description", "last_income_date", "stability", "regularity", "trend", "lookback_periods", "full_periods", "periods_with_income", "number_of_incomes", "confidence", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account_id"]) -> MetaOapg.properties.account_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["income_type"]) -> 'EnumIncomeStreamType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["frequency"]) -> 'EnumIncomeStreamFrequency': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["monthly_average"]) -> MetaOapg.properties.monthly_average: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["average_income_amount"]) -> MetaOapg.properties.average_income_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_income_amount"]) -> MetaOapg.properties.last_income_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_income_description"]) -> MetaOapg.properties.last_income_description: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_income_date"]) -> MetaOapg.properties.last_income_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["stability"]) -> MetaOapg.properties.stability: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["regularity"]) -> MetaOapg.properties.regularity: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["trend"]) -> MetaOapg.properties.trend: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lookback_periods"]) -> MetaOapg.properties.lookback_periods: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["full_periods"]) -> MetaOapg.properties.full_periods: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["periods_with_income"]) -> MetaOapg.properties.periods_with_income: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number_of_incomes"]) -> MetaOapg.properties.number_of_incomes: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["confidence"]) -> 'EnumIncomeStreamConfidence': ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["account_id", "income_type", "frequency", "monthly_average", "average_income_amount", "last_income_amount", "currency", "last_income_description", "last_income_date", "stability", "regularity", "trend", "lookback_periods", "full_periods", "periods_with_income", "number_of_incomes", "confidence", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        monthly_average: typing.Union[MetaOapg.properties.monthly_average, decimal.Decimal, int, float, ],
        full_periods: typing.Union[MetaOapg.properties.full_periods, decimal.Decimal, int, ],
        last_income_date: typing.Union[MetaOapg.properties.last_income_date, str, date, ],
        average_income_amount: typing.Union[MetaOapg.properties.average_income_amount, decimal.Decimal, int, float, ],
        number_of_incomes: typing.Union[MetaOapg.properties.number_of_incomes, decimal.Decimal, int, ],
        trend: typing.Union[MetaOapg.properties.trend, None, decimal.Decimal, int, float, ],
        lookback_periods: typing.Union[MetaOapg.properties.lookback_periods, decimal.Decimal, int, ],
        confidence: 'EnumIncomeStreamConfidence',
        last_income_amount: typing.Union[MetaOapg.properties.last_income_amount, decimal.Decimal, int, float, ],
        regularity: typing.Union[MetaOapg.properties.regularity, None, decimal.Decimal, int, float, ],
        frequency: 'EnumIncomeStreamFrequency',
        last_income_description: typing.Union[MetaOapg.properties.last_income_description, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        periods_with_income: typing.Union[MetaOapg.properties.periods_with_income, decimal.Decimal, int, ],
        account_id: typing.Union[MetaOapg.properties.account_id, str, ],
        income_type: 'EnumIncomeStreamType',
        currency: typing.Union[MetaOapg.properties.currency, str, ],
        stability: typing.Union[MetaOapg.properties.stability, None, decimal.Decimal, int, float, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'IncomeStreamsBody':
        return super().__new__(
            cls,
            *args,
            monthly_average=monthly_average,
            full_periods=full_periods,
            last_income_date=last_income_date,
            average_income_amount=average_income_amount,
            number_of_incomes=number_of_incomes,
            trend=trend,
            lookback_periods=lookback_periods,
            confidence=confidence,
            last_income_amount=last_income_amount,
            regularity=regularity,
            frequency=frequency,
            last_income_description=last_income_description,
            periods_with_income=periods_with_income,
            account_id=account_id,
            income_type=income_type,
            currency=currency,
            stability=stability,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_income_stream_confidence import EnumIncomeStreamConfidence
from belvo_client.model.enum_income_stream_frequency import EnumIncomeStreamFrequency
from belvo_client.model.enum_income_stream_type import EnumIncomeStreamType
