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


class ReceivablesTransaction(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "fees",
            "created_at",
            "number_of_installments",
            "gross_amount",
            "type",
            "collected_at",
            "institution_transaction_id",
            "value_hour",
            "currency",
            "id",
            "net_amount",
            "account",
            "status",
            "value_date",
        }
        
        class properties:
            id = schemas.UUIDSchema
        
            @staticmethod
            def account() -> typing.Type['ReceivablesTransactionAccount']:
                return ReceivablesTransactionAccount
            created_at = schemas.DateTimeSchema
            collected_at = schemas.DateTimeSchema
            value_hour = schemas.StrSchema
            value_date = schemas.DateSchema
            institution_transaction_id = schemas.StrSchema
            currency = schemas.StrSchema
        
            @staticmethod
            def type() -> typing.Type['EnumReceivableTransactionType']:
                return EnumReceivableTransactionType
            
            
            class gross_amount(
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
                ) -> 'gross_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class net_amount(
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
                ) -> 'net_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class fees(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['RecevablesTransactionFees']:
                        return RecevablesTransactionFees
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['RecevablesTransactionFees'], typing.List['RecevablesTransactionFees']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'fees':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'RecevablesTransactionFees':
                    return super().__getitem__(i)
        
            @staticmethod
            def status() -> typing.Type['EnumReceivableTransactionStatus']:
                return EnumReceivableTransactionStatus
        
            @staticmethod
            def number_of_installments() -> typing.Type['ReceivablesTransactionNumberOfInstallments']:
                return ReceivablesTransactionNumberOfInstallments
            __annotations__ = {
                "id": id,
                "account": account,
                "created_at": created_at,
                "collected_at": collected_at,
                "value_hour": value_hour,
                "value_date": value_date,
                "institution_transaction_id": institution_transaction_id,
                "currency": currency,
                "type": type,
                "gross_amount": gross_amount,
                "net_amount": net_amount,
                "fees": fees,
                "status": status,
                "number_of_installments": number_of_installments,
            }
    
    fees: MetaOapg.properties.fees
    created_at: MetaOapg.properties.created_at
    number_of_installments: 'ReceivablesTransactionNumberOfInstallments'
    gross_amount: MetaOapg.properties.gross_amount
    type: 'EnumReceivableTransactionType'
    collected_at: MetaOapg.properties.collected_at
    institution_transaction_id: MetaOapg.properties.institution_transaction_id
    value_hour: MetaOapg.properties.value_hour
    currency: MetaOapg.properties.currency
    id: MetaOapg.properties.id
    net_amount: MetaOapg.properties.net_amount
    account: 'ReceivablesTransactionAccount'
    status: 'EnumReceivableTransactionStatus'
    value_date: MetaOapg.properties.value_date
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account"]) -> 'ReceivablesTransactionAccount': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["value_hour"]) -> MetaOapg.properties.value_hour: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["value_date"]) -> MetaOapg.properties.value_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["institution_transaction_id"]) -> MetaOapg.properties.institution_transaction_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["type"]) -> 'EnumReceivableTransactionType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["gross_amount"]) -> MetaOapg.properties.gross_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["net_amount"]) -> MetaOapg.properties.net_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["fees"]) -> MetaOapg.properties.fees: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> 'EnumReceivableTransactionStatus': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number_of_installments"]) -> 'ReceivablesTransactionNumberOfInstallments': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "account", "created_at", "collected_at", "value_hour", "value_date", "institution_transaction_id", "currency", "type", "gross_amount", "net_amount", "fees", "status", "number_of_installments", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account"]) -> 'ReceivablesTransactionAccount': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["value_hour"]) -> MetaOapg.properties.value_hour: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["value_date"]) -> MetaOapg.properties.value_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["institution_transaction_id"]) -> MetaOapg.properties.institution_transaction_id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> 'EnumReceivableTransactionType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["gross_amount"]) -> MetaOapg.properties.gross_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["net_amount"]) -> MetaOapg.properties.net_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["fees"]) -> MetaOapg.properties.fees: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> 'EnumReceivableTransactionStatus': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number_of_installments"]) -> 'ReceivablesTransactionNumberOfInstallments': ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "account", "created_at", "collected_at", "value_hour", "value_date", "institution_transaction_id", "currency", "type", "gross_amount", "net_amount", "fees", "status", "number_of_installments", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        fees: typing.Union[MetaOapg.properties.fees, list, tuple, ],
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, ],
        number_of_installments: 'ReceivablesTransactionNumberOfInstallments',
        gross_amount: typing.Union[MetaOapg.properties.gross_amount, None, decimal.Decimal, int, float, ],
        type: 'EnumReceivableTransactionType',
        collected_at: typing.Union[MetaOapg.properties.collected_at, str, datetime, ],
        institution_transaction_id: typing.Union[MetaOapg.properties.institution_transaction_id, str, ],
        value_hour: typing.Union[MetaOapg.properties.value_hour, str, ],
        currency: typing.Union[MetaOapg.properties.currency, str, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, ],
        net_amount: typing.Union[MetaOapg.properties.net_amount, None, decimal.Decimal, int, float, ],
        account: 'ReceivablesTransactionAccount',
        status: 'EnumReceivableTransactionStatus',
        value_date: typing.Union[MetaOapg.properties.value_date, str, date, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ReceivablesTransaction':
        return super().__new__(
            cls,
            *args,
            fees=fees,
            created_at=created_at,
            number_of_installments=number_of_installments,
            gross_amount=gross_amount,
            type=type,
            collected_at=collected_at,
            institution_transaction_id=institution_transaction_id,
            value_hour=value_hour,
            currency=currency,
            id=id,
            net_amount=net_amount,
            account=account,
            status=status,
            value_date=value_date,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_receivable_transaction_status import EnumReceivableTransactionStatus
from belvo_client.model.enum_receivable_transaction_type import EnumReceivableTransactionType
from belvo_client.model.receivables_transaction_account import ReceivablesTransactionAccount
from belvo_client.model.receivables_transaction_number_of_installments import ReceivablesTransactionNumberOfInstallments
from belvo_client.model.recevables_transaction_fees import RecevablesTransactionFees
