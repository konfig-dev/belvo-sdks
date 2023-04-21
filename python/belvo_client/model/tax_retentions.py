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


class TaxRetentions(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "cancelled_at",
            "code",
            "receiver_id",
            "invoice_identification",
            "retention_breakdown",
            "sender_name",
            "certified_at",
            "issued_at",
            "version",
            "sender_id",
            "collected_at",
            "total_invoice_amount",
            "receiver_nationality",
            "total_exempt_amount",
            "xml",
            "receiver_name",
            "total_retained_amount",
            "total_taxable_amount",
        }
        
        class properties:
            
            
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
                schemas.UUIDBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'uuid'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, uuid.UUID, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'invoice_identification':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class code(
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
                ) -> 'code':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class issued_at(
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
                ) -> 'issued_at':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class certified_at(
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
                ) -> 'certified_at':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class cancelled_at(
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
                ) -> 'cancelled_at':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
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
        
            @staticmethod
            def receiver_nationality() -> typing.Type['EnumTaxRetentionReceiverNationality']:
                return EnumTaxRetentionReceiverNationality
            
            
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
            
            
            class total_invoice_amount(
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
                ) -> 'total_invoice_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_exempt_amount(
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
                ) -> 'total_exempt_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_retained_amount(
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
                ) -> 'total_retained_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_taxable_amount(
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
                ) -> 'total_taxable_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class retention_breakdown(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['RetentionBreakdown']:
                        return RetentionBreakdown
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'retention_breakdown':
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
            id = schemas.UUIDSchema
            link = schemas.UUIDSchema
            created_at = schemas.DateTimeSchema
            __annotations__ = {
                "version": version,
                "collected_at": collected_at,
                "invoice_identification": invoice_identification,
                "code": code,
                "issued_at": issued_at,
                "certified_at": certified_at,
                "cancelled_at": cancelled_at,
                "sender_id": sender_id,
                "sender_name": sender_name,
                "receiver_nationality": receiver_nationality,
                "receiver_id": receiver_id,
                "receiver_name": receiver_name,
                "total_invoice_amount": total_invoice_amount,
                "total_exempt_amount": total_exempt_amount,
                "total_retained_amount": total_retained_amount,
                "total_taxable_amount": total_taxable_amount,
                "retention_breakdown": retention_breakdown,
                "xml": xml,
                "id": id,
                "link": link,
                "created_at": created_at,
            }
    
    cancelled_at: MetaOapg.properties.cancelled_at
    code: MetaOapg.properties.code
    receiver_id: MetaOapg.properties.receiver_id
    invoice_identification: MetaOapg.properties.invoice_identification
    retention_breakdown: MetaOapg.properties.retention_breakdown
    sender_name: MetaOapg.properties.sender_name
    certified_at: MetaOapg.properties.certified_at
    issued_at: MetaOapg.properties.issued_at
    version: MetaOapg.properties.version
    sender_id: MetaOapg.properties.sender_id
    collected_at: MetaOapg.properties.collected_at
    total_invoice_amount: MetaOapg.properties.total_invoice_amount
    receiver_nationality: 'EnumTaxRetentionReceiverNationality'
    total_exempt_amount: MetaOapg.properties.total_exempt_amount
    xml: MetaOapg.properties.xml
    receiver_name: MetaOapg.properties.receiver_name
    total_retained_amount: MetaOapg.properties.total_retained_amount
    total_taxable_amount: MetaOapg.properties.total_taxable_amount
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["version"]) -> MetaOapg.properties.version: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["invoice_identification"]) -> MetaOapg.properties.invoice_identification: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["code"]) -> MetaOapg.properties.code: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["issued_at"]) -> MetaOapg.properties.issued_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["certified_at"]) -> MetaOapg.properties.certified_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cancelled_at"]) -> MetaOapg.properties.cancelled_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sender_id"]) -> MetaOapg.properties.sender_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sender_name"]) -> MetaOapg.properties.sender_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receiver_nationality"]) -> 'EnumTaxRetentionReceiverNationality': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receiver_id"]) -> MetaOapg.properties.receiver_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receiver_name"]) -> MetaOapg.properties.receiver_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_invoice_amount"]) -> MetaOapg.properties.total_invoice_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_exempt_amount"]) -> MetaOapg.properties.total_exempt_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_retained_amount"]) -> MetaOapg.properties.total_retained_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_taxable_amount"]) -> MetaOapg.properties.total_taxable_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["retention_breakdown"]) -> MetaOapg.properties.retention_breakdown: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["xml"]) -> MetaOapg.properties.xml: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["version", "collected_at", "invoice_identification", "code", "issued_at", "certified_at", "cancelled_at", "sender_id", "sender_name", "receiver_nationality", "receiver_id", "receiver_name", "total_invoice_amount", "total_exempt_amount", "total_retained_amount", "total_taxable_amount", "retention_breakdown", "xml", "id", "link", "created_at", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["version"]) -> MetaOapg.properties.version: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["invoice_identification"]) -> MetaOapg.properties.invoice_identification: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["code"]) -> MetaOapg.properties.code: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["issued_at"]) -> MetaOapg.properties.issued_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["certified_at"]) -> MetaOapg.properties.certified_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cancelled_at"]) -> MetaOapg.properties.cancelled_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sender_id"]) -> MetaOapg.properties.sender_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sender_name"]) -> MetaOapg.properties.sender_name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receiver_nationality"]) -> 'EnumTaxRetentionReceiverNationality': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receiver_id"]) -> MetaOapg.properties.receiver_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receiver_name"]) -> MetaOapg.properties.receiver_name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_invoice_amount"]) -> MetaOapg.properties.total_invoice_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_exempt_amount"]) -> MetaOapg.properties.total_exempt_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_retained_amount"]) -> MetaOapg.properties.total_retained_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_taxable_amount"]) -> MetaOapg.properties.total_taxable_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["retention_breakdown"]) -> MetaOapg.properties.retention_breakdown: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["xml"]) -> MetaOapg.properties.xml: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["link"]) -> typing.Union[MetaOapg.properties.link, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> typing.Union[MetaOapg.properties.created_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["version", "collected_at", "invoice_identification", "code", "issued_at", "certified_at", "cancelled_at", "sender_id", "sender_name", "receiver_nationality", "receiver_id", "receiver_name", "total_invoice_amount", "total_exempt_amount", "total_retained_amount", "total_taxable_amount", "retention_breakdown", "xml", "id", "link", "created_at", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        cancelled_at: typing.Union[MetaOapg.properties.cancelled_at, None, str, datetime, ],
        code: typing.Union[MetaOapg.properties.code, None, decimal.Decimal, int, ],
        receiver_id: typing.Union[MetaOapg.properties.receiver_id, None, str, ],
        invoice_identification: typing.Union[MetaOapg.properties.invoice_identification, None, str, uuid.UUID, ],
        retention_breakdown: typing.Union[MetaOapg.properties.retention_breakdown, list, tuple, None, ],
        sender_name: typing.Union[MetaOapg.properties.sender_name, None, str, ],
        certified_at: typing.Union[MetaOapg.properties.certified_at, None, str, datetime, ],
        issued_at: typing.Union[MetaOapg.properties.issued_at, None, str, datetime, ],
        version: typing.Union[MetaOapg.properties.version, None, str, ],
        sender_id: typing.Union[MetaOapg.properties.sender_id, None, str, ],
        collected_at: typing.Union[MetaOapg.properties.collected_at, None, str, datetime, ],
        total_invoice_amount: typing.Union[MetaOapg.properties.total_invoice_amount, None, decimal.Decimal, int, float, ],
        receiver_nationality: 'EnumTaxRetentionReceiverNationality',
        total_exempt_amount: typing.Union[MetaOapg.properties.total_exempt_amount, None, decimal.Decimal, int, float, ],
        xml: typing.Union[MetaOapg.properties.xml, None, str, ],
        receiver_name: typing.Union[MetaOapg.properties.receiver_name, None, str, ],
        total_retained_amount: typing.Union[MetaOapg.properties.total_retained_amount, None, decimal.Decimal, int, float, ],
        total_taxable_amount: typing.Union[MetaOapg.properties.total_taxable_amount, None, decimal.Decimal, int, float, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        link: typing.Union[MetaOapg.properties.link, str, uuid.UUID, schemas.Unset] = schemas.unset,
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'TaxRetentions':
        return super().__new__(
            cls,
            *args,
            cancelled_at=cancelled_at,
            code=code,
            receiver_id=receiver_id,
            invoice_identification=invoice_identification,
            retention_breakdown=retention_breakdown,
            sender_name=sender_name,
            certified_at=certified_at,
            issued_at=issued_at,
            version=version,
            sender_id=sender_id,
            collected_at=collected_at,
            total_invoice_amount=total_invoice_amount,
            receiver_nationality=receiver_nationality,
            total_exempt_amount=total_exempt_amount,
            xml=xml,
            receiver_name=receiver_name,
            total_retained_amount=total_retained_amount,
            total_taxable_amount=total_taxable_amount,
            id=id,
            link=link,
            created_at=created_at,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_tax_retention_receiver_nationality import EnumTaxRetentionReceiverNationality
from belvo_client.model.retention_breakdown import RetentionBreakdown
