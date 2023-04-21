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


class RecurringExpenses(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Recurring expense insights.


ℹ️ If no recurring expense insights are found, we return an empty array.

    """


    class MetaOapg:
        required = {
            "days_since_last_transaction",
            "median_transaction_amount",
            "payment_type",
            "average_transaction_amount",
            "name",
            "category",
            "transactions",
            "account",
            "frequency",
        }
        
        class properties:
        
            @staticmethod
            def account() -> typing.Type['Account']:
                return Account
            
            
            class name(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'name':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class transactions(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['RecurringExpenseSourceTransaction']:
                        return RecurringExpenseSourceTransaction
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['RecurringExpenseSourceTransaction'], typing.List['RecurringExpenseSourceTransaction']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'transactions':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'RecurringExpenseSourceTransaction':
                    return super().__getitem__(i)
        
            @staticmethod
            def frequency() -> typing.Type['EnumRecurringExpenseFrequency']:
                return EnumRecurringExpenseFrequency
            average_transaction_amount = schemas.Float32Schema
            median_transaction_amount = schemas.Float32Schema
            days_since_last_transaction = schemas.Int32Schema
        
            @staticmethod
            def category() -> typing.Type['EnumRecurringExpenseCategory']:
                return EnumRecurringExpenseCategory
        
            @staticmethod
            def payment_type() -> typing.Type['EnumRecurringExpensePaymentType']:
                return EnumRecurringExpensePaymentType
            id = schemas.UUIDSchema
            __annotations__ = {
                "account": account,
                "name": name,
                "transactions": transactions,
                "frequency": frequency,
                "average_transaction_amount": average_transaction_amount,
                "median_transaction_amount": median_transaction_amount,
                "days_since_last_transaction": days_since_last_transaction,
                "category": category,
                "payment_type": payment_type,
                "id": id,
            }
    
    days_since_last_transaction: MetaOapg.properties.days_since_last_transaction
    median_transaction_amount: MetaOapg.properties.median_transaction_amount
    payment_type: 'EnumRecurringExpensePaymentType'
    average_transaction_amount: MetaOapg.properties.average_transaction_amount
    name: MetaOapg.properties.name
    category: 'EnumRecurringExpenseCategory'
    transactions: MetaOapg.properties.transactions
    account: 'Account'
    frequency: 'EnumRecurringExpenseFrequency'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account"]) -> 'Account': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["transactions"]) -> MetaOapg.properties.transactions: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["frequency"]) -> 'EnumRecurringExpenseFrequency': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["average_transaction_amount"]) -> MetaOapg.properties.average_transaction_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["median_transaction_amount"]) -> MetaOapg.properties.median_transaction_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["days_since_last_transaction"]) -> MetaOapg.properties.days_since_last_transaction: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> 'EnumRecurringExpenseCategory': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_type"]) -> 'EnumRecurringExpensePaymentType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["account", "name", "transactions", "frequency", "average_transaction_amount", "median_transaction_amount", "days_since_last_transaction", "category", "payment_type", "id", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account"]) -> 'Account': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["transactions"]) -> MetaOapg.properties.transactions: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["frequency"]) -> 'EnumRecurringExpenseFrequency': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["average_transaction_amount"]) -> MetaOapg.properties.average_transaction_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["median_transaction_amount"]) -> MetaOapg.properties.median_transaction_amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["days_since_last_transaction"]) -> MetaOapg.properties.days_since_last_transaction: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["category"]) -> 'EnumRecurringExpenseCategory': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_type"]) -> 'EnumRecurringExpensePaymentType': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["account", "name", "transactions", "frequency", "average_transaction_amount", "median_transaction_amount", "days_since_last_transaction", "category", "payment_type", "id", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        days_since_last_transaction: typing.Union[MetaOapg.properties.days_since_last_transaction, decimal.Decimal, int, ],
        median_transaction_amount: typing.Union[MetaOapg.properties.median_transaction_amount, decimal.Decimal, int, float, ],
        payment_type: 'EnumRecurringExpensePaymentType',
        average_transaction_amount: typing.Union[MetaOapg.properties.average_transaction_amount, decimal.Decimal, int, float, ],
        name: typing.Union[MetaOapg.properties.name, None, str, ],
        category: 'EnumRecurringExpenseCategory',
        transactions: typing.Union[MetaOapg.properties.transactions, list, tuple, ],
        account: 'Account',
        frequency: 'EnumRecurringExpenseFrequency',
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'RecurringExpenses':
        return super().__new__(
            cls,
            *args,
            days_since_last_transaction=days_since_last_transaction,
            median_transaction_amount=median_transaction_amount,
            payment_type=payment_type,
            average_transaction_amount=average_transaction_amount,
            name=name,
            category=category,
            transactions=transactions,
            account=account,
            frequency=frequency,
            id=id,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.account import Account
from belvo_client.model.enum_recurring_expense_category import EnumRecurringExpenseCategory
from belvo_client.model.enum_recurring_expense_frequency import EnumRecurringExpenseFrequency
from belvo_client.model.enum_recurring_expense_payment_type import EnumRecurringExpensePaymentType
from belvo_client.model.recurring_expense_source_transaction import RecurringExpenseSourceTransaction
