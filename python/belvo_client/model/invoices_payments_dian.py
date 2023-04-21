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


class InvoicesPaymentsDian(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "date",
            "related_documents",
            "amount",
            "payment_type",
            "exchange_rate",
            "payer_account_number",
            "payer_rfc",
            "currency",
            "beneficiary_account_number",
            "operation_number",
            "payer_bank_name",
        }
        
        class properties:
            
            
            class date(
                schemas.DateTimeBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'date-time'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, datetime, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class payment_type(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'payment_type':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class currency(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'currency':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class exchange_rate(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'exchange_rate':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class amount(
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
                ) -> 'amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class operation_number(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'operation_number':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class beneficiary_account_number(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'beneficiary_account_number':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class payer_rfc(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'payer_rfc':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class payer_account_number(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'payer_account_number':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class payer_bank_name(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'payer_bank_name':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class related_documents(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['InvoicesPaymentsRelatedDocumentsDian']:
                        return InvoicesPaymentsRelatedDocumentsDian
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['InvoicesPaymentsRelatedDocumentsDian'], typing.List['InvoicesPaymentsRelatedDocumentsDian']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'related_documents':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'InvoicesPaymentsRelatedDocumentsDian':
                    return super().__getitem__(i)
            
            
            class beneficiary_rfc(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'beneficiary_rfc':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "date": date,
                "payment_type": payment_type,
                "currency": currency,
                "exchange_rate": exchange_rate,
                "amount": amount,
                "operation_number": operation_number,
                "beneficiary_account_number": beneficiary_account_number,
                "payer_rfc": payer_rfc,
                "payer_account_number": payer_account_number,
                "payer_bank_name": payer_bank_name,
                "related_documents": related_documents,
                "beneficiary_rfc": beneficiary_rfc,
            }
    
    date: MetaOapg.properties.date
    related_documents: MetaOapg.properties.related_documents
    amount: MetaOapg.properties.amount
    payment_type: MetaOapg.properties.payment_type
    exchange_rate: MetaOapg.properties.exchange_rate
    payer_account_number: MetaOapg.properties.payer_account_number
    payer_rfc: MetaOapg.properties.payer_rfc
    currency: MetaOapg.properties.currency
    beneficiary_account_number: MetaOapg.properties.beneficiary_account_number
    operation_number: MetaOapg.properties.operation_number
    payer_bank_name: MetaOapg.properties.payer_bank_name
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> MetaOapg.properties.date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_type"]) -> MetaOapg.properties.payment_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["exchange_rate"]) -> MetaOapg.properties.exchange_rate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["amount"]) -> MetaOapg.properties.amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["operation_number"]) -> MetaOapg.properties.operation_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["beneficiary_account_number"]) -> MetaOapg.properties.beneficiary_account_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payer_rfc"]) -> MetaOapg.properties.payer_rfc: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payer_account_number"]) -> MetaOapg.properties.payer_account_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payer_bank_name"]) -> MetaOapg.properties.payer_bank_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["related_documents"]) -> MetaOapg.properties.related_documents: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["beneficiary_rfc"]) -> MetaOapg.properties.beneficiary_rfc: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["date", "payment_type", "currency", "exchange_rate", "amount", "operation_number", "beneficiary_account_number", "payer_rfc", "payer_account_number", "payer_bank_name", "related_documents", "beneficiary_rfc", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date"]) -> MetaOapg.properties.date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_type"]) -> MetaOapg.properties.payment_type: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["exchange_rate"]) -> MetaOapg.properties.exchange_rate: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["amount"]) -> MetaOapg.properties.amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["operation_number"]) -> MetaOapg.properties.operation_number: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["beneficiary_account_number"]) -> MetaOapg.properties.beneficiary_account_number: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payer_rfc"]) -> MetaOapg.properties.payer_rfc: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payer_account_number"]) -> MetaOapg.properties.payer_account_number: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payer_bank_name"]) -> MetaOapg.properties.payer_bank_name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["related_documents"]) -> MetaOapg.properties.related_documents: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["beneficiary_rfc"]) -> typing.Union[MetaOapg.properties.beneficiary_rfc, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["date", "payment_type", "currency", "exchange_rate", "amount", "operation_number", "beneficiary_account_number", "payer_rfc", "payer_account_number", "payer_bank_name", "related_documents", "beneficiary_rfc", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        date: typing.Union[MetaOapg.properties.date, None, str, datetime, ],
        related_documents: typing.Union[MetaOapg.properties.related_documents, list, tuple, ],
        amount: typing.Union[MetaOapg.properties.amount, None, decimal.Decimal, int, float, ],
        payment_type: typing.Union[MetaOapg.properties.payment_type, None, str, ],
        exchange_rate: typing.Union[MetaOapg.properties.exchange_rate, None, str, ],
        payer_account_number: typing.Union[MetaOapg.properties.payer_account_number, None, str, ],
        payer_rfc: typing.Union[MetaOapg.properties.payer_rfc, None, str, ],
        currency: typing.Union[MetaOapg.properties.currency, None, str, ],
        beneficiary_account_number: typing.Union[MetaOapg.properties.beneficiary_account_number, None, str, ],
        operation_number: typing.Union[MetaOapg.properties.operation_number, None, str, ],
        payer_bank_name: typing.Union[MetaOapg.properties.payer_bank_name, None, str, ],
        beneficiary_rfc: typing.Union[MetaOapg.properties.beneficiary_rfc, None, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'InvoicesPaymentsDian':
        return super().__new__(
            cls,
            *args,
            date=date,
            related_documents=related_documents,
            amount=amount,
            payment_type=payment_type,
            exchange_rate=exchange_rate,
            payer_account_number=payer_account_number,
            payer_rfc=payer_rfc,
            currency=currency,
            beneficiary_account_number=beneficiary_account_number,
            operation_number=operation_number,
            payer_bank_name=payer_bank_name,
            beneficiary_rfc=beneficiary_rfc,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.invoices_payments_related_documents_dian import InvoicesPaymentsRelatedDocumentsDian
