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


class InvestmentsPortfolioInstrument(
    schemas.DictBase,
    schemas.NoneBase,
    schemas.Schema,
    schemas.NoneFrozenDictMixin
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "open_date",
            "fees",
            "interest_rates",
            "quantity",
            "type",
            "public_id",
            "redemption_conditions",
            "balance_net",
            "subtype",
            "price",
            "balance_gross",
            "name",
            "currency",
            "profit",
            "average_acquisition_price",
        }
        
        class properties:
            
            
            class public_id(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['InvestmentsPortfolioInstrumentPublicId']:
                        return InvestmentsPortfolioInstrumentPublicId
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'public_id':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def type() -> typing.Type['EnumInvestmentPortfolioInstrumentType']:
                return EnumInvestmentPortfolioInstrumentType
            
            
            class subtype(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'subtype':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            name = schemas.StrSchema
            currency = schemas.StrSchema
            
            
            class price(
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
                ) -> 'price':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class quantity(
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
                ) -> 'quantity':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class balance_gross(
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
                ) -> 'balance_gross':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class balance_net(
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
                ) -> 'balance_net':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class average_acquisition_price(
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
                ) -> 'average_acquisition_price':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class profit(
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
                ) -> 'profit':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class open_date(
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
                ) -> 'open_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class redemption_conditions(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['InvestmentsPortfolioInstrumentRedemptionConditions']:
                        return InvestmentsPortfolioInstrumentRedemptionConditions
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'redemption_conditions':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class fees(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['InvestmentsPortfolioInstrumentFees']:
                        return InvestmentsPortfolioInstrumentFees
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'fees':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class interest_rates(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['InvestmentsPortfolioInstrumentInterestRate']:
                        return InvestmentsPortfolioInstrumentInterestRate
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'interest_rates':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            id = schemas.UUIDSchema
            __annotations__ = {
                "public_id": public_id,
                "type": type,
                "subtype": subtype,
                "name": name,
                "currency": currency,
                "price": price,
                "quantity": quantity,
                "balance_gross": balance_gross,
                "balance_net": balance_net,
                "average_acquisition_price": average_acquisition_price,
                "profit": profit,
                "open_date": open_date,
                "redemption_conditions": redemption_conditions,
                "fees": fees,
                "interest_rates": interest_rates,
                "id": id,
            }

    
    open_date: MetaOapg.properties.open_date
    fees: MetaOapg.properties.fees
    interest_rates: MetaOapg.properties.interest_rates
    quantity: MetaOapg.properties.quantity
    type: 'EnumInvestmentPortfolioInstrumentType'
    public_id: MetaOapg.properties.public_id
    redemption_conditions: MetaOapg.properties.redemption_conditions
    balance_net: MetaOapg.properties.balance_net
    subtype: MetaOapg.properties.subtype
    price: MetaOapg.properties.price
    balance_gross: MetaOapg.properties.balance_gross
    name: MetaOapg.properties.name
    currency: MetaOapg.properties.currency
    profit: MetaOapg.properties.profit
    average_acquisition_price: MetaOapg.properties.average_acquisition_price
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["public_id"]) -> MetaOapg.properties.public_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["type"]) -> 'EnumInvestmentPortfolioInstrumentType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["subtype"]) -> MetaOapg.properties.subtype: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["price"]) -> MetaOapg.properties.price: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["quantity"]) -> MetaOapg.properties.quantity: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["balance_gross"]) -> MetaOapg.properties.balance_gross: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["balance_net"]) -> MetaOapg.properties.balance_net: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["average_acquisition_price"]) -> MetaOapg.properties.average_acquisition_price: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["profit"]) -> MetaOapg.properties.profit: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["open_date"]) -> MetaOapg.properties.open_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["redemption_conditions"]) -> MetaOapg.properties.redemption_conditions: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["fees"]) -> MetaOapg.properties.fees: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["interest_rates"]) -> MetaOapg.properties.interest_rates: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["public_id", "type", "subtype", "name", "currency", "price", "quantity", "balance_gross", "balance_net", "average_acquisition_price", "profit", "open_date", "redemption_conditions", "fees", "interest_rates", "id", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["public_id"]) -> MetaOapg.properties.public_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> 'EnumInvestmentPortfolioInstrumentType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["subtype"]) -> MetaOapg.properties.subtype: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["price"]) -> MetaOapg.properties.price: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["quantity"]) -> MetaOapg.properties.quantity: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["balance_gross"]) -> MetaOapg.properties.balance_gross: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["balance_net"]) -> MetaOapg.properties.balance_net: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["average_acquisition_price"]) -> MetaOapg.properties.average_acquisition_price: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["profit"]) -> MetaOapg.properties.profit: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["open_date"]) -> MetaOapg.properties.open_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["redemption_conditions"]) -> MetaOapg.properties.redemption_conditions: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["fees"]) -> MetaOapg.properties.fees: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["interest_rates"]) -> MetaOapg.properties.interest_rates: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["public_id", "type", "subtype", "name", "currency", "price", "quantity", "balance_gross", "balance_net", "average_acquisition_price", "profit", "open_date", "redemption_conditions", "fees", "interest_rates", "id", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, None, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'InvestmentsPortfolioInstrument':
        return super().__new__(
            cls,
            *args,
            id=id,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_investment_portfolio_instrument_type import EnumInvestmentPortfolioInstrumentType
from belvo_client.model.investments_portfolio_instrument_fees import InvestmentsPortfolioInstrumentFees
from belvo_client.model.investments_portfolio_instrument_interest_rate import InvestmentsPortfolioInstrumentInterestRate
from belvo_client.model.investments_portfolio_instrument_public_id import InvestmentsPortfolioInstrumentPublicId
from belvo_client.model.investments_portfolio_instrument_redemption_conditions import InvestmentsPortfolioInstrumentRedemptionConditions
