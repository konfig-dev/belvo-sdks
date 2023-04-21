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


class InvoiceDian(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "tax_amount",
            "discount_amount",
            "receiver_id",
            "payments",
            "invoice_identification",
            "sender_name",
            "type",
            "sender_id",
            "invoice_date",
            "receiver_name",
            "currency",
            "invoice_type",
            "invoice_details",
            "exchange_rate",
            "certification_authority",
            "cancelation_status",
            "subtotal_amount",
            "cancelation_update_date",
            "collected_at",
            "payment_type",
            "total_amount",
            "payroll",
            "payment_type_description",
            "certification_date",
            "status",
        }
        
        class properties:
            
            
            class collected_at(
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
                ) -> 'collected_at':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class invoice_identification(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'invoice_identification':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class invoice_date(
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
                ) -> 'invoice_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class status(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'status':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def invoice_type() -> typing.Type['EnumInvoiceDianInvoiceType']:
                return EnumInvoiceDianInvoiceType
        
            @staticmethod
            def type() -> typing.Type['EnumInvoiceType']:
                return EnumInvoiceType
            
            
            class sender_id(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'sender_id':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class sender_name(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'sender_name':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class receiver_id(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'receiver_id':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class receiver_name(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'receiver_name':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class cancelation_status(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'cancelation_status':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class cancelation_update_date(
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
                ) -> 'cancelation_update_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class certification_date(
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
                ) -> 'certification_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class certification_authority(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'certification_authority':
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
            
            
            class payment_type_description(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'payment_type_description':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class invoice_details(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['InvoiceDetailDian']:
                        return InvoiceDetailDian
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['InvoiceDetailDian'], typing.List['InvoiceDetailDian']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'invoice_details':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'InvoiceDetailDian':
                    return super().__getitem__(i)
            
            
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
            
            
            class subtotal_amount(
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
                ) -> 'subtotal_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class exchange_rate(
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
                ) -> 'exchange_rate':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class tax_amount(
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
                ) -> 'tax_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class discount_amount(
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
                ) -> 'discount_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_amount(
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
                ) -> 'total_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class payments(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['InvoicesPaymentsDian']:
                        return InvoicesPaymentsDian
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['InvoicesPaymentsDian'], typing.List['InvoicesPaymentsDian']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'payments':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'InvoicesPaymentsDian':
                    return super().__getitem__(i)
        
            @staticmethod
            def payroll() -> typing.Type['InvoicesPayrollDian']:
                return InvoicesPayrollDian
            
            
            class version(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'version':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            id = schemas.UUIDSchema
            link = schemas.StrSchema
            created_at = schemas.DateTimeSchema
            
            
            class expiration_date(
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
                ) -> 'expiration_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def sender_details() -> typing.Type['InvoiceSenderDetailsDian']:
                return InvoiceSenderDetailsDian
            
            
            class sender_tax_fraud_status(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'sender_tax_fraud_status':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def receiver_details() -> typing.Type['InvoicesReceiverDetailsDian']:
                return InvoicesReceiverDetailsDian
            
            
            class receiver_tax_fraud_status(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'receiver_tax_fraud_status':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def payment_method() -> typing.Type['EnumInvoiceDianPaymentMethod']:
                return EnumInvoiceDianPaymentMethod
            
            
            class payment_method_description(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'payment_method_description':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class usage(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'usage':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class place_of_issue(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'place_of_issue':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class folio(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'folio':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class xml(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'xml':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def warnings() -> typing.Type['InvoiceWarningsDian']:
                return InvoiceWarningsDian
            __annotations__ = {
                "collected_at": collected_at,
                "invoice_identification": invoice_identification,
                "invoice_date": invoice_date,
                "status": status,
                "invoice_type": invoice_type,
                "type": type,
                "sender_id": sender_id,
                "sender_name": sender_name,
                "receiver_id": receiver_id,
                "receiver_name": receiver_name,
                "cancelation_status": cancelation_status,
                "cancelation_update_date": cancelation_update_date,
                "certification_date": certification_date,
                "certification_authority": certification_authority,
                "payment_type": payment_type,
                "payment_type_description": payment_type_description,
                "invoice_details": invoice_details,
                "currency": currency,
                "subtotal_amount": subtotal_amount,
                "exchange_rate": exchange_rate,
                "tax_amount": tax_amount,
                "discount_amount": discount_amount,
                "total_amount": total_amount,
                "payments": payments,
                "payroll": payroll,
                "version": version,
                "id": id,
                "link": link,
                "created_at": created_at,
                "expiration_date": expiration_date,
                "sender_details": sender_details,
                "sender_tax_fraud_status": sender_tax_fraud_status,
                "receiver_details": receiver_details,
                "receiver_tax_fraud_status": receiver_tax_fraud_status,
                "payment_method": payment_method,
                "payment_method_description": payment_method_description,
                "usage": usage,
                "place_of_issue": place_of_issue,
                "folio": folio,
                "xml": xml,
                "warnings": warnings,
            }
    
    tax_amount: MetaOapg.properties.tax_amount
    discount_amount: MetaOapg.properties.discount_amount
    receiver_id: MetaOapg.properties.receiver_id
    payments: MetaOapg.properties.payments
    invoice_identification: MetaOapg.properties.invoice_identification
    sender_name: MetaOapg.properties.sender_name
    type: 'EnumInvoiceType'
    sender_id: MetaOapg.properties.sender_id
    invoice_date: MetaOapg.properties.invoice_date
    receiver_name: MetaOapg.properties.receiver_name
    currency: MetaOapg.properties.currency
    invoice_type: 'EnumInvoiceDianInvoiceType'
    invoice_details: MetaOapg.properties.invoice_details
    exchange_rate: MetaOapg.properties.exchange_rate
    certification_authority: MetaOapg.properties.certification_authority
    cancelation_status: MetaOapg.properties.cancelation_status
    subtotal_amount: MetaOapg.properties.subtotal_amount
    cancelation_update_date: MetaOapg.properties.cancelation_update_date
    collected_at: MetaOapg.properties.collected_at
    payment_type: MetaOapg.properties.payment_type
    total_amount: MetaOapg.properties.total_amount
    payroll: 'InvoicesPayrollDian'
    payment_type_description: MetaOapg.properties.payment_type_description
    certification_date: MetaOapg.properties.certification_date
    status: MetaOapg.properties.status
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["invoice_identification"]) -> MetaOapg.properties.invoice_identification: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["invoice_date"]) -> MetaOapg.properties.invoice_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["invoice_type"]) -> 'EnumInvoiceDianInvoiceType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["type"]) -> 'EnumInvoiceType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sender_id"]) -> MetaOapg.properties.sender_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sender_name"]) -> MetaOapg.properties.sender_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receiver_id"]) -> MetaOapg.properties.receiver_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receiver_name"]) -> MetaOapg.properties.receiver_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cancelation_status"]) -> MetaOapg.properties.cancelation_status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cancelation_update_date"]) -> MetaOapg.properties.cancelation_update_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["certification_date"]) -> MetaOapg.properties.certification_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["certification_authority"]) -> MetaOapg.properties.certification_authority: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_type"]) -> MetaOapg.properties.payment_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_type_description"]) -> MetaOapg.properties.payment_type_description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["invoice_details"]) -> MetaOapg.properties.invoice_details: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["subtotal_amount"]) -> MetaOapg.properties.subtotal_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["exchange_rate"]) -> MetaOapg.properties.exchange_rate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tax_amount"]) -> MetaOapg.properties.tax_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["discount_amount"]) -> MetaOapg.properties.discount_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_amount"]) -> MetaOapg.properties.total_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payments"]) -> MetaOapg.properties.payments: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payroll"]) -> 'InvoicesPayrollDian': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["version"]) -> MetaOapg.properties.version: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["expiration_date"]) -> MetaOapg.properties.expiration_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sender_details"]) -> 'InvoiceSenderDetailsDian': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sender_tax_fraud_status"]) -> MetaOapg.properties.sender_tax_fraud_status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receiver_details"]) -> 'InvoicesReceiverDetailsDian': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receiver_tax_fraud_status"]) -> MetaOapg.properties.receiver_tax_fraud_status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_method"]) -> 'EnumInvoiceDianPaymentMethod': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_method_description"]) -> MetaOapg.properties.payment_method_description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["usage"]) -> MetaOapg.properties.usage: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["place_of_issue"]) -> MetaOapg.properties.place_of_issue: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["folio"]) -> MetaOapg.properties.folio: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["xml"]) -> MetaOapg.properties.xml: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["warnings"]) -> 'InvoiceWarningsDian': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["collected_at", "invoice_identification", "invoice_date", "status", "invoice_type", "type", "sender_id", "sender_name", "receiver_id", "receiver_name", "cancelation_status", "cancelation_update_date", "certification_date", "certification_authority", "payment_type", "payment_type_description", "invoice_details", "currency", "subtotal_amount", "exchange_rate", "tax_amount", "discount_amount", "total_amount", "payments", "payroll", "version", "id", "link", "created_at", "expiration_date", "sender_details", "sender_tax_fraud_status", "receiver_details", "receiver_tax_fraud_status", "payment_method", "payment_method_description", "usage", "place_of_issue", "folio", "xml", "warnings", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["invoice_identification"]) -> MetaOapg.properties.invoice_identification: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["invoice_date"]) -> MetaOapg.properties.invoice_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["invoice_type"]) -> 'EnumInvoiceDianInvoiceType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> 'EnumInvoiceType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sender_id"]) -> MetaOapg.properties.sender_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sender_name"]) -> MetaOapg.properties.sender_name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receiver_id"]) -> MetaOapg.properties.receiver_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receiver_name"]) -> MetaOapg.properties.receiver_name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cancelation_status"]) -> MetaOapg.properties.cancelation_status: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cancelation_update_date"]) -> MetaOapg.properties.cancelation_update_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["certification_date"]) -> MetaOapg.properties.certification_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["certification_authority"]) -> MetaOapg.properties.certification_authority: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_type"]) -> MetaOapg.properties.payment_type: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_type_description"]) -> MetaOapg.properties.payment_type_description: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["invoice_details"]) -> MetaOapg.properties.invoice_details: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["subtotal_amount"]) -> MetaOapg.properties.subtotal_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["exchange_rate"]) -> MetaOapg.properties.exchange_rate: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tax_amount"]) -> MetaOapg.properties.tax_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["discount_amount"]) -> MetaOapg.properties.discount_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_amount"]) -> MetaOapg.properties.total_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payments"]) -> MetaOapg.properties.payments: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payroll"]) -> 'InvoicesPayrollDian': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["version"]) -> typing.Union[MetaOapg.properties.version, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["link"]) -> typing.Union[MetaOapg.properties.link, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> typing.Union[MetaOapg.properties.created_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["expiration_date"]) -> typing.Union[MetaOapg.properties.expiration_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sender_details"]) -> typing.Union['InvoiceSenderDetailsDian', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sender_tax_fraud_status"]) -> typing.Union[MetaOapg.properties.sender_tax_fraud_status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receiver_details"]) -> typing.Union['InvoicesReceiverDetailsDian', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receiver_tax_fraud_status"]) -> typing.Union[MetaOapg.properties.receiver_tax_fraud_status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_method"]) -> typing.Union['EnumInvoiceDianPaymentMethod', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_method_description"]) -> typing.Union[MetaOapg.properties.payment_method_description, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["usage"]) -> typing.Union[MetaOapg.properties.usage, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["place_of_issue"]) -> typing.Union[MetaOapg.properties.place_of_issue, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["folio"]) -> typing.Union[MetaOapg.properties.folio, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["xml"]) -> typing.Union[MetaOapg.properties.xml, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["warnings"]) -> typing.Union['InvoiceWarningsDian', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["collected_at", "invoice_identification", "invoice_date", "status", "invoice_type", "type", "sender_id", "sender_name", "receiver_id", "receiver_name", "cancelation_status", "cancelation_update_date", "certification_date", "certification_authority", "payment_type", "payment_type_description", "invoice_details", "currency", "subtotal_amount", "exchange_rate", "tax_amount", "discount_amount", "total_amount", "payments", "payroll", "version", "id", "link", "created_at", "expiration_date", "sender_details", "sender_tax_fraud_status", "receiver_details", "receiver_tax_fraud_status", "payment_method", "payment_method_description", "usage", "place_of_issue", "folio", "xml", "warnings", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        tax_amount: typing.Union[MetaOapg.properties.tax_amount, None, decimal.Decimal, int, float, ],
        discount_amount: typing.Union[MetaOapg.properties.discount_amount, None, decimal.Decimal, int, float, ],
        receiver_id: typing.Union[MetaOapg.properties.receiver_id, None, str, ],
        payments: typing.Union[MetaOapg.properties.payments, list, tuple, ],
        invoice_identification: typing.Union[MetaOapg.properties.invoice_identification, None, str, ],
        sender_name: typing.Union[MetaOapg.properties.sender_name, None, str, ],
        type: 'EnumInvoiceType',
        sender_id: typing.Union[MetaOapg.properties.sender_id, None, str, ],
        invoice_date: typing.Union[MetaOapg.properties.invoice_date, None, str, date, ],
        receiver_name: typing.Union[MetaOapg.properties.receiver_name, None, str, ],
        currency: typing.Union[MetaOapg.properties.currency, None, str, ],
        invoice_type: 'EnumInvoiceDianInvoiceType',
        invoice_details: typing.Union[MetaOapg.properties.invoice_details, list, tuple, ],
        exchange_rate: typing.Union[MetaOapg.properties.exchange_rate, None, decimal.Decimal, int, float, ],
        certification_authority: typing.Union[MetaOapg.properties.certification_authority, None, str, ],
        cancelation_status: typing.Union[MetaOapg.properties.cancelation_status, None, str, ],
        subtotal_amount: typing.Union[MetaOapg.properties.subtotal_amount, None, decimal.Decimal, int, float, ],
        cancelation_update_date: typing.Union[MetaOapg.properties.cancelation_update_date, None, str, date, ],
        collected_at: typing.Union[MetaOapg.properties.collected_at, None, str, datetime, ],
        payment_type: typing.Union[MetaOapg.properties.payment_type, None, str, ],
        total_amount: typing.Union[MetaOapg.properties.total_amount, None, decimal.Decimal, int, float, ],
        payroll: 'InvoicesPayrollDian',
        payment_type_description: typing.Union[MetaOapg.properties.payment_type_description, None, str, ],
        certification_date: typing.Union[MetaOapg.properties.certification_date, None, str, date, ],
        status: typing.Union[MetaOapg.properties.status, None, str, ],
        version: typing.Union[MetaOapg.properties.version, None, str, schemas.Unset] = schemas.unset,
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        link: typing.Union[MetaOapg.properties.link, str, schemas.Unset] = schemas.unset,
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, schemas.Unset] = schemas.unset,
        expiration_date: typing.Union[MetaOapg.properties.expiration_date, None, str, date, schemas.Unset] = schemas.unset,
        sender_details: typing.Union['InvoiceSenderDetailsDian', schemas.Unset] = schemas.unset,
        sender_tax_fraud_status: typing.Union[MetaOapg.properties.sender_tax_fraud_status, None, str, schemas.Unset] = schemas.unset,
        receiver_details: typing.Union['InvoicesReceiverDetailsDian', schemas.Unset] = schemas.unset,
        receiver_tax_fraud_status: typing.Union[MetaOapg.properties.receiver_tax_fraud_status, None, str, schemas.Unset] = schemas.unset,
        payment_method: typing.Union['EnumInvoiceDianPaymentMethod', schemas.Unset] = schemas.unset,
        payment_method_description: typing.Union[MetaOapg.properties.payment_method_description, None, str, schemas.Unset] = schemas.unset,
        usage: typing.Union[MetaOapg.properties.usage, None, str, schemas.Unset] = schemas.unset,
        place_of_issue: typing.Union[MetaOapg.properties.place_of_issue, None, str, schemas.Unset] = schemas.unset,
        folio: typing.Union[MetaOapg.properties.folio, None, str, schemas.Unset] = schemas.unset,
        xml: typing.Union[MetaOapg.properties.xml, None, str, schemas.Unset] = schemas.unset,
        warnings: typing.Union['InvoiceWarningsDian', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'InvoiceDian':
        return super().__new__(
            cls,
            *args,
            tax_amount=tax_amount,
            discount_amount=discount_amount,
            receiver_id=receiver_id,
            payments=payments,
            invoice_identification=invoice_identification,
            sender_name=sender_name,
            type=type,
            sender_id=sender_id,
            invoice_date=invoice_date,
            receiver_name=receiver_name,
            currency=currency,
            invoice_type=invoice_type,
            invoice_details=invoice_details,
            exchange_rate=exchange_rate,
            certification_authority=certification_authority,
            cancelation_status=cancelation_status,
            subtotal_amount=subtotal_amount,
            cancelation_update_date=cancelation_update_date,
            collected_at=collected_at,
            payment_type=payment_type,
            total_amount=total_amount,
            payroll=payroll,
            payment_type_description=payment_type_description,
            certification_date=certification_date,
            status=status,
            version=version,
            id=id,
            link=link,
            created_at=created_at,
            expiration_date=expiration_date,
            sender_details=sender_details,
            sender_tax_fraud_status=sender_tax_fraud_status,
            receiver_details=receiver_details,
            receiver_tax_fraud_status=receiver_tax_fraud_status,
            payment_method=payment_method,
            payment_method_description=payment_method_description,
            usage=usage,
            place_of_issue=place_of_issue,
            folio=folio,
            xml=xml,
            warnings=warnings,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_invoice_dian_invoice_type import EnumInvoiceDianInvoiceType
from belvo_client.model.enum_invoice_dian_payment_method import EnumInvoiceDianPaymentMethod
from belvo_client.model.enum_invoice_type import EnumInvoiceType
from belvo_client.model.invoice_detail_dian import InvoiceDetailDian
from belvo_client.model.invoice_sender_details_dian import InvoiceSenderDetailsDian
from belvo_client.model.invoice_warnings_dian import InvoiceWarningsDian
from belvo_client.model.invoices_payments_dian import InvoicesPaymentsDian
from belvo_client.model.invoices_payroll_dian import InvoicesPayrollDian
from belvo_client.model.invoices_receiver_details_dian import InvoicesReceiverDetailsDian
