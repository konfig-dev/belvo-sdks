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


class Transaction(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "amount",
            "description",
            "merchant",
            "type",
            "collected_at",
            "reference",
            "balance",
            "observations",
            "currency",
            "category",
            "account",
            "accounting_date",
            "status",
            "value_date",
        }
        
        class properties:
            
            
            class description(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'description':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def account() -> typing.Type['Account']:
                return Account
            
            
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
            
            
            class value_date(
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
                ) -> 'value_date':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class accounting_date(
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
                ) -> 'accounting_date':
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
            
            
            class balance(
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
                ) -> 'balance':
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
            
            
                class MetaOapg:
            
            
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
            
            
            class observations(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'observations':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def merchant() -> typing.Type['TransactionMerchantData']:
                return TransactionMerchantData
        
            @staticmethod
            def category() -> typing.Type['EnumTransactionCategory']:
                return EnumTransactionCategory
            
            
            class reference(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'reference':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def type() -> typing.Type['EnumTransactionType']:
                return EnumTransactionType
        
            @staticmethod
            def status() -> typing.Type['EnumTransactionStatus']:
                return EnumTransactionStatus
            id = schemas.UUIDSchema
            
            
            class internal_identification(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'internal_identification':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            created_at = schemas.DateTimeSchema
        
            @staticmethod
            def subcategory() -> typing.Type['EnumTransactionSubcategory']:
                return EnumTransactionSubcategory
        
            @staticmethod
            def credit_card_data() -> typing.Type['TransactionCreditCardData']:
                return TransactionCreditCardData
            __annotations__ = {
                "description": description,
                "account": account,
                "collected_at": collected_at,
                "value_date": value_date,
                "accounting_date": accounting_date,
                "amount": amount,
                "balance": balance,
                "currency": currency,
                "observations": observations,
                "merchant": merchant,
                "category": category,
                "reference": reference,
                "type": type,
                "status": status,
                "id": id,
                "internal_identification": internal_identification,
                "created_at": created_at,
                "subcategory": subcategory,
                "credit_card_data": credit_card_data,
            }
    
    amount: MetaOapg.properties.amount
    description: MetaOapg.properties.description
    merchant: 'TransactionMerchantData'
    type: 'EnumTransactionType'
    collected_at: MetaOapg.properties.collected_at
    reference: MetaOapg.properties.reference
    balance: MetaOapg.properties.balance
    observations: MetaOapg.properties.observations
    currency: MetaOapg.properties.currency
    category: 'EnumTransactionCategory'
    account: 'Account'
    accounting_date: MetaOapg.properties.accounting_date
    status: 'EnumTransactionStatus'
    value_date: MetaOapg.properties.value_date
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account"]) -> 'Account': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["value_date"]) -> MetaOapg.properties.value_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["accounting_date"]) -> MetaOapg.properties.accounting_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["amount"]) -> MetaOapg.properties.amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["balance"]) -> MetaOapg.properties.balance: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["observations"]) -> MetaOapg.properties.observations: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["merchant"]) -> 'TransactionMerchantData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> 'EnumTransactionCategory': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["reference"]) -> MetaOapg.properties.reference: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["type"]) -> 'EnumTransactionType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> 'EnumTransactionStatus': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["internal_identification"]) -> MetaOapg.properties.internal_identification: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["subcategory"]) -> 'EnumTransactionSubcategory': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["credit_card_data"]) -> 'TransactionCreditCardData': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["description", "account", "collected_at", "value_date", "accounting_date", "amount", "balance", "currency", "observations", "merchant", "category", "reference", "type", "status", "id", "internal_identification", "created_at", "subcategory", "credit_card_data", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account"]) -> 'Account': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["value_date"]) -> MetaOapg.properties.value_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["accounting_date"]) -> MetaOapg.properties.accounting_date: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["amount"]) -> MetaOapg.properties.amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["balance"]) -> MetaOapg.properties.balance: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["observations"]) -> MetaOapg.properties.observations: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["merchant"]) -> 'TransactionMerchantData': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["category"]) -> 'EnumTransactionCategory': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["reference"]) -> MetaOapg.properties.reference: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> 'EnumTransactionType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> 'EnumTransactionStatus': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["internal_identification"]) -> typing.Union[MetaOapg.properties.internal_identification, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> typing.Union[MetaOapg.properties.created_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["subcategory"]) -> typing.Union['EnumTransactionSubcategory', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["credit_card_data"]) -> typing.Union['TransactionCreditCardData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["description", "account", "collected_at", "value_date", "accounting_date", "amount", "balance", "currency", "observations", "merchant", "category", "reference", "type", "status", "id", "internal_identification", "created_at", "subcategory", "credit_card_data", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        amount: typing.Union[MetaOapg.properties.amount, None, decimal.Decimal, int, float, ],
        description: typing.Union[MetaOapg.properties.description, None, str, ],
        merchant: 'TransactionMerchantData',
        type: 'EnumTransactionType',
        collected_at: typing.Union[MetaOapg.properties.collected_at, None, str, datetime, ],
        reference: typing.Union[MetaOapg.properties.reference, None, str, ],
        balance: typing.Union[MetaOapg.properties.balance, None, decimal.Decimal, int, float, ],
        observations: typing.Union[MetaOapg.properties.observations, None, str, ],
        currency: typing.Union[MetaOapg.properties.currency, None, str, ],
        category: 'EnumTransactionCategory',
        account: 'Account',
        accounting_date: typing.Union[MetaOapg.properties.accounting_date, None, str, datetime, ],
        status: 'EnumTransactionStatus',
        value_date: typing.Union[MetaOapg.properties.value_date, None, str, date, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        internal_identification: typing.Union[MetaOapg.properties.internal_identification, None, str, schemas.Unset] = schemas.unset,
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, schemas.Unset] = schemas.unset,
        subcategory: typing.Union['EnumTransactionSubcategory', schemas.Unset] = schemas.unset,
        credit_card_data: typing.Union['TransactionCreditCardData', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Transaction':
        return super().__new__(
            cls,
            *args,
            amount=amount,
            description=description,
            merchant=merchant,
            type=type,
            collected_at=collected_at,
            reference=reference,
            balance=balance,
            observations=observations,
            currency=currency,
            category=category,
            account=account,
            accounting_date=accounting_date,
            status=status,
            value_date=value_date,
            id=id,
            internal_identification=internal_identification,
            created_at=created_at,
            subcategory=subcategory,
            credit_card_data=credit_card_data,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.account import Account
from belvo_client.model.enum_transaction_category import EnumTransactionCategory
from belvo_client.model.enum_transaction_status import EnumTransactionStatus
from belvo_client.model.enum_transaction_subcategory import EnumTransactionSubcategory
from belvo_client.model.enum_transaction_type import EnumTransactionType
from belvo_client.model.transaction_credit_card_data import TransactionCreditCardData
from belvo_client.model.transaction_merchant_data import TransactionMerchantData
