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


class AccountsLoanData(
    schemas.DictBase,
    schemas.NoneBase,
    schemas.Schema,
    schemas.NoneFrozenDictMixin
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    The loan options associated with this account.
    """


    class MetaOapg:
        required = {
            "principal",
            "interest_rates",
            "outstanding_balance",
            "collected_at",
            "monthly_payment",
        }
        
        class properties:
            collected_at = schemas.DateTimeSchema
            
            
            class principal(
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
                ) -> 'principal':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class outstanding_balance(
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
                ) -> 'outstanding_balance':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class monthly_payment(
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
                ) -> 'monthly_payment':
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
                    def items() -> typing.Type['AccountsLoanDataInterestRate']:
                        return AccountsLoanDataInterestRate
            
            
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
            
            
            class contract_amount(
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
                ) -> 'contract_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class loan_type(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'loan_type':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class payment_day(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'payment_day':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class outstanding_principal(
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
                ) -> 'outstanding_principal':
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
                    def items() -> typing.Type['AccountsLoanDataFees']:
                        return AccountsLoanDataFees
            
            
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
            
            
            class number_of_installments_total(
                schemas.Int32Base,
                schemas.IntBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'int32'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'number_of_installments_total':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class number_of_installments_outstanding(
                schemas.Int32Base,
                schemas.IntBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                class MetaOapg:
                    format = 'int32'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'number_of_installments_outstanding':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class contract_start_date(
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
                ) -> 'contract_start_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            contract_end_date = schemas.DateSchema
            
            
            class contract_number(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'contract_number':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class credit_limit(
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'credit_limit':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class last_period_balance(
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'last_period_balance':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class interest_rate(
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'interest_rate':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class limit_day(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'limit_day':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class cutting_day(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'cutting_day':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class cutting_date(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'cutting_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class last_payment_date(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'last_payment_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class no_interest_payment(
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'no_interest_payment':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "collected_at": collected_at,
                "principal": principal,
                "outstanding_balance": outstanding_balance,
                "monthly_payment": monthly_payment,
                "interest_rates": interest_rates,
                "contract_amount": contract_amount,
                "loan_type": loan_type,
                "payment_day": payment_day,
                "outstanding_principal": outstanding_principal,
                "fees": fees,
                "number_of_installments_total": number_of_installments_total,
                "number_of_installments_outstanding": number_of_installments_outstanding,
                "contract_start_date": contract_start_date,
                "contract_end_date": contract_end_date,
                "contract_number": contract_number,
                "credit_limit": credit_limit,
                "last_period_balance": last_period_balance,
                "interest_rate": interest_rate,
                "limit_day": limit_day,
                "cutting_day": cutting_day,
                "cutting_date": cutting_date,
                "last_payment_date": last_payment_date,
                "no_interest_payment": no_interest_payment,
            }

    
    principal: MetaOapg.properties.principal
    interest_rates: MetaOapg.properties.interest_rates
    outstanding_balance: MetaOapg.properties.outstanding_balance
    collected_at: MetaOapg.properties.collected_at
    monthly_payment: MetaOapg.properties.monthly_payment
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["principal"]) -> MetaOapg.properties.principal: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["outstanding_balance"]) -> MetaOapg.properties.outstanding_balance: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["monthly_payment"]) -> MetaOapg.properties.monthly_payment: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["interest_rates"]) -> MetaOapg.properties.interest_rates: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["contract_amount"]) -> MetaOapg.properties.contract_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["loan_type"]) -> MetaOapg.properties.loan_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_day"]) -> MetaOapg.properties.payment_day: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["outstanding_principal"]) -> MetaOapg.properties.outstanding_principal: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["fees"]) -> MetaOapg.properties.fees: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_of_installments_total"]) -> MetaOapg.properties.number_of_installments_total: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_of_installments_outstanding"]) -> MetaOapg.properties.number_of_installments_outstanding: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["contract_start_date"]) -> MetaOapg.properties.contract_start_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["contract_end_date"]) -> MetaOapg.properties.contract_end_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["contract_number"]) -> MetaOapg.properties.contract_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["credit_limit"]) -> MetaOapg.properties.credit_limit: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_period_balance"]) -> MetaOapg.properties.last_period_balance: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["interest_rate"]) -> MetaOapg.properties.interest_rate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["limit_day"]) -> MetaOapg.properties.limit_day: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cutting_day"]) -> MetaOapg.properties.cutting_day: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cutting_date"]) -> MetaOapg.properties.cutting_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_payment_date"]) -> MetaOapg.properties.last_payment_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["no_interest_payment"]) -> MetaOapg.properties.no_interest_payment: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["collected_at", "principal", "outstanding_balance", "monthly_payment", "interest_rates", "contract_amount", "loan_type", "payment_day", "outstanding_principal", "fees", "number_of_installments_total", "number_of_installments_outstanding", "contract_start_date", "contract_end_date", "contract_number", "credit_limit", "last_period_balance", "interest_rate", "limit_day", "cutting_day", "cutting_date", "last_payment_date", "no_interest_payment", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["principal"]) -> MetaOapg.properties.principal: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["outstanding_balance"]) -> MetaOapg.properties.outstanding_balance: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["monthly_payment"]) -> MetaOapg.properties.monthly_payment: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["interest_rates"]) -> MetaOapg.properties.interest_rates: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["contract_amount"]) -> typing.Union[MetaOapg.properties.contract_amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["loan_type"]) -> typing.Union[MetaOapg.properties.loan_type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_day"]) -> typing.Union[MetaOapg.properties.payment_day, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["outstanding_principal"]) -> typing.Union[MetaOapg.properties.outstanding_principal, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["fees"]) -> typing.Union[MetaOapg.properties.fees, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number_of_installments_total"]) -> typing.Union[MetaOapg.properties.number_of_installments_total, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number_of_installments_outstanding"]) -> typing.Union[MetaOapg.properties.number_of_installments_outstanding, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["contract_start_date"]) -> typing.Union[MetaOapg.properties.contract_start_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["contract_end_date"]) -> typing.Union[MetaOapg.properties.contract_end_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["contract_number"]) -> typing.Union[MetaOapg.properties.contract_number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["credit_limit"]) -> typing.Union[MetaOapg.properties.credit_limit, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_period_balance"]) -> typing.Union[MetaOapg.properties.last_period_balance, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["interest_rate"]) -> typing.Union[MetaOapg.properties.interest_rate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["limit_day"]) -> typing.Union[MetaOapg.properties.limit_day, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cutting_day"]) -> typing.Union[MetaOapg.properties.cutting_day, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cutting_date"]) -> typing.Union[MetaOapg.properties.cutting_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_payment_date"]) -> typing.Union[MetaOapg.properties.last_payment_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["no_interest_payment"]) -> typing.Union[MetaOapg.properties.no_interest_payment, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["collected_at", "principal", "outstanding_balance", "monthly_payment", "interest_rates", "contract_amount", "loan_type", "payment_day", "outstanding_principal", "fees", "number_of_installments_total", "number_of_installments_outstanding", "contract_start_date", "contract_end_date", "contract_number", "credit_limit", "last_period_balance", "interest_rate", "limit_day", "cutting_day", "cutting_date", "last_payment_date", "no_interest_payment", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, None, ],
        contract_amount: typing.Union[MetaOapg.properties.contract_amount, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        loan_type: typing.Union[MetaOapg.properties.loan_type, None, str, schemas.Unset] = schemas.unset,
        payment_day: typing.Union[MetaOapg.properties.payment_day, None, str, schemas.Unset] = schemas.unset,
        outstanding_principal: typing.Union[MetaOapg.properties.outstanding_principal, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        fees: typing.Union[MetaOapg.properties.fees, list, tuple, None, schemas.Unset] = schemas.unset,
        number_of_installments_total: typing.Union[MetaOapg.properties.number_of_installments_total, None, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        number_of_installments_outstanding: typing.Union[MetaOapg.properties.number_of_installments_outstanding, None, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        contract_start_date: typing.Union[MetaOapg.properties.contract_start_date, None, str, date, schemas.Unset] = schemas.unset,
        contract_end_date: typing.Union[MetaOapg.properties.contract_end_date, str, date, schemas.Unset] = schemas.unset,
        contract_number: typing.Union[MetaOapg.properties.contract_number, None, str, schemas.Unset] = schemas.unset,
        credit_limit: typing.Union[MetaOapg.properties.credit_limit, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        last_period_balance: typing.Union[MetaOapg.properties.last_period_balance, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        interest_rate: typing.Union[MetaOapg.properties.interest_rate, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        limit_day: typing.Union[MetaOapg.properties.limit_day, None, str, schemas.Unset] = schemas.unset,
        cutting_day: typing.Union[MetaOapg.properties.cutting_day, None, str, schemas.Unset] = schemas.unset,
        cutting_date: typing.Union[MetaOapg.properties.cutting_date, None, str, schemas.Unset] = schemas.unset,
        last_payment_date: typing.Union[MetaOapg.properties.last_payment_date, None, str, schemas.Unset] = schemas.unset,
        no_interest_payment: typing.Union[MetaOapg.properties.no_interest_payment, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'AccountsLoanData':
        return super().__new__(
            cls,
            *args,
            contract_amount=contract_amount,
            loan_type=loan_type,
            payment_day=payment_day,
            outstanding_principal=outstanding_principal,
            fees=fees,
            number_of_installments_total=number_of_installments_total,
            number_of_installments_outstanding=number_of_installments_outstanding,
            contract_start_date=contract_start_date,
            contract_end_date=contract_end_date,
            contract_number=contract_number,
            credit_limit=credit_limit,
            last_period_balance=last_period_balance,
            interest_rate=interest_rate,
            limit_day=limit_day,
            cutting_day=cutting_day,
            cutting_date=cutting_date,
            last_payment_date=last_payment_date,
            no_interest_payment=no_interest_payment,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.accounts_loan_data_fees import AccountsLoanDataFees
from belvo_client.model.accounts_loan_data_interest_rate import AccountsLoanDataInterestRate
