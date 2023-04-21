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


class Account(
    schemas.DictBase,
    schemas.NoneBase,
    schemas.Schema,
    schemas.NoneFrozenDictMixin
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Details regarding the account.

**Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report.

    """


    class MetaOapg:
        required = {
            "loan_data",
            "public_identification_value",
            "type",
            "collected_at",
            "number",
            "balance",
            "credit_data",
            "name",
            "balance_type",
            "currency",
            "last_accessed_at",
            "category",
            "public_identification_name",
        }
        
        class properties:
            collected_at = schemas.DateTimeSchema
        
            @staticmethod
            def category() -> typing.Type['EnumAccountCategory']:
                return EnumAccountCategory
            
            
            class balance_type(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'balance_type':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class type(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'type':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
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
            
            
            class number(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'number':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def balance() -> typing.Type['AccountsBalance']:
                return AccountsBalance
            
            
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
            
            
            class public_identification_name(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'public_identification_name':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class public_identification_value(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'public_identification_value':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class last_accessed_at(
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
                ) -> 'last_accessed_at':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def credit_data() -> typing.Type['AccountsCreditData']:
                return AccountsCreditData
        
            @staticmethod
            def loan_data() -> typing.Type['AccountsLoanData']:
                return AccountsLoanData
            id = schemas.UUIDSchema
            
            
            class link(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'link':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def institution() -> typing.Type['InstitutionAccount']:
                return InstitutionAccount
            created_at = schemas.DateTimeSchema
            
            
            class funds_data(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['AccountsFundsData']:
                        return AccountsFundsData
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'funds_data':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def receivables_data() -> typing.Type['AccountsReceivablesData']:
                return AccountsReceivablesData
            
            
            class bank_product_id(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'bank_product_id':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class internal_identification(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
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
            __annotations__ = {
                "collected_at": collected_at,
                "category": category,
                "balance_type": balance_type,
                "type": type,
                "name": name,
                "number": number,
                "balance": balance,
                "currency": currency,
                "public_identification_name": public_identification_name,
                "public_identification_value": public_identification_value,
                "last_accessed_at": last_accessed_at,
                "credit_data": credit_data,
                "loan_data": loan_data,
                "id": id,
                "link": link,
                "institution": institution,
                "created_at": created_at,
                "funds_data": funds_data,
                "receivables_data": receivables_data,
                "bank_product_id": bank_product_id,
                "internal_identification": internal_identification,
            }

    
    loan_data: 'AccountsLoanData'
    public_identification_value: MetaOapg.properties.public_identification_value
    type: MetaOapg.properties.type
    collected_at: MetaOapg.properties.collected_at
    number: MetaOapg.properties.number
    balance: 'AccountsBalance'
    credit_data: 'AccountsCreditData'
    name: MetaOapg.properties.name
    balance_type: MetaOapg.properties.balance_type
    currency: MetaOapg.properties.currency
    last_accessed_at: MetaOapg.properties.last_accessed_at
    category: 'EnumAccountCategory'
    public_identification_name: MetaOapg.properties.public_identification_name
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> 'EnumAccountCategory': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["balance_type"]) -> MetaOapg.properties.balance_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> MetaOapg.properties.number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["balance"]) -> 'AccountsBalance': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["public_identification_name"]) -> MetaOapg.properties.public_identification_name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["public_identification_value"]) -> MetaOapg.properties.public_identification_value: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_accessed_at"]) -> MetaOapg.properties.last_accessed_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["credit_data"]) -> 'AccountsCreditData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["loan_data"]) -> 'AccountsLoanData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["institution"]) -> 'InstitutionAccount': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["funds_data"]) -> MetaOapg.properties.funds_data: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receivables_data"]) -> 'AccountsReceivablesData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["bank_product_id"]) -> MetaOapg.properties.bank_product_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["internal_identification"]) -> MetaOapg.properties.internal_identification: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["collected_at", "category", "balance_type", "type", "name", "number", "balance", "currency", "public_identification_name", "public_identification_value", "last_accessed_at", "credit_data", "loan_data", "id", "link", "institution", "created_at", "funds_data", "receivables_data", "bank_product_id", "internal_identification", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["category"]) -> 'EnumAccountCategory': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["balance_type"]) -> MetaOapg.properties.balance_type: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> MetaOapg.properties.type: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number"]) -> MetaOapg.properties.number: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["balance"]) -> 'AccountsBalance': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> MetaOapg.properties.currency: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["public_identification_name"]) -> MetaOapg.properties.public_identification_name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["public_identification_value"]) -> MetaOapg.properties.public_identification_value: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_accessed_at"]) -> MetaOapg.properties.last_accessed_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["credit_data"]) -> 'AccountsCreditData': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["loan_data"]) -> 'AccountsLoanData': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["link"]) -> typing.Union[MetaOapg.properties.link, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["institution"]) -> typing.Union['InstitutionAccount', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> typing.Union[MetaOapg.properties.created_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["funds_data"]) -> typing.Union[MetaOapg.properties.funds_data, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receivables_data"]) -> typing.Union['AccountsReceivablesData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["bank_product_id"]) -> typing.Union[MetaOapg.properties.bank_product_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["internal_identification"]) -> typing.Union[MetaOapg.properties.internal_identification, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["collected_at", "category", "balance_type", "type", "name", "number", "balance", "currency", "public_identification_name", "public_identification_value", "last_accessed_at", "credit_data", "loan_data", "id", "link", "institution", "created_at", "funds_data", "receivables_data", "bank_product_id", "internal_identification", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, None, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        link: typing.Union[MetaOapg.properties.link, None, str, schemas.Unset] = schemas.unset,
        institution: typing.Union['InstitutionAccount', schemas.Unset] = schemas.unset,
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, schemas.Unset] = schemas.unset,
        funds_data: typing.Union[MetaOapg.properties.funds_data, list, tuple, None, schemas.Unset] = schemas.unset,
        receivables_data: typing.Union['AccountsReceivablesData', schemas.Unset] = schemas.unset,
        bank_product_id: typing.Union[MetaOapg.properties.bank_product_id, None, str, schemas.Unset] = schemas.unset,
        internal_identification: typing.Union[MetaOapg.properties.internal_identification, None, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Account':
        return super().__new__(
            cls,
            *args,
            id=id,
            link=link,
            institution=institution,
            created_at=created_at,
            funds_data=funds_data,
            receivables_data=receivables_data,
            bank_product_id=bank_product_id,
            internal_identification=internal_identification,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.accounts_balance import AccountsBalance
from belvo_client.model.accounts_credit_data import AccountsCreditData
from belvo_client.model.accounts_funds_data import AccountsFundsData
from belvo_client.model.accounts_loan_data import AccountsLoanData
from belvo_client.model.accounts_receivables_data import AccountsReceivablesData
from belvo_client.model.enum_account_category import EnumAccountCategory
from belvo_client.model.institution_account import InstitutionAccount
