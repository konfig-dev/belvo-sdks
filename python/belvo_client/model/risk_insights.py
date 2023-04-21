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


class RiskInsights(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "credit_cards_metrics",
            "link",
            "transactions_metrics",
            "created_at",
            "accounts",
            "id",
            "balances_metrics",
            "loans_metrics",
            "cashflow_metrics",
        }
        
        class properties:
            id = schemas.UUIDSchema
            link = schemas.UUIDSchema
            
            
            class accounts(
                schemas.ListBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneTupleMixin
            ):
            
            
                class MetaOapg:
                    items = schemas.UUIDSchema
            
            
                def __new__(
                    cls,
                    *args: typing.Union[list, tuple, None, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'accounts':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            created_at = schemas.DateTimeSchema
        
            @staticmethod
            def transactions_metrics() -> typing.Type['RiskInsightsTransactionMetrics']:
                return RiskInsightsTransactionMetrics
        
            @staticmethod
            def balances_metrics() -> typing.Type['RiskInsightsBalanceMetrics']:
                return RiskInsightsBalanceMetrics
        
            @staticmethod
            def cashflow_metrics() -> typing.Type['RiskInsightsCashflowMetrics']:
                return RiskInsightsCashflowMetrics
        
            @staticmethod
            def credit_cards_metrics() -> typing.Type['RiskInsightsCreditCardMetrics']:
                return RiskInsightsCreditCardMetrics
        
            @staticmethod
            def loans_metrics() -> typing.Type['RiskInsightsLoansMetrics']:
                return RiskInsightsLoansMetrics
            __annotations__ = {
                "id": id,
                "link": link,
                "accounts": accounts,
                "created_at": created_at,
                "transactions_metrics": transactions_metrics,
                "balances_metrics": balances_metrics,
                "cashflow_metrics": cashflow_metrics,
                "credit_cards_metrics": credit_cards_metrics,
                "loans_metrics": loans_metrics,
            }
    
    credit_cards_metrics: 'RiskInsightsCreditCardMetrics'
    link: MetaOapg.properties.link
    transactions_metrics: 'RiskInsightsTransactionMetrics'
    created_at: MetaOapg.properties.created_at
    accounts: MetaOapg.properties.accounts
    id: MetaOapg.properties.id
    balances_metrics: 'RiskInsightsBalanceMetrics'
    loans_metrics: 'RiskInsightsLoansMetrics'
    cashflow_metrics: 'RiskInsightsCashflowMetrics'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["accounts"]) -> MetaOapg.properties.accounts: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["transactions_metrics"]) -> 'RiskInsightsTransactionMetrics': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["balances_metrics"]) -> 'RiskInsightsBalanceMetrics': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cashflow_metrics"]) -> 'RiskInsightsCashflowMetrics': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["credit_cards_metrics"]) -> 'RiskInsightsCreditCardMetrics': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["loans_metrics"]) -> 'RiskInsightsLoansMetrics': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "link", "accounts", "created_at", "transactions_metrics", "balances_metrics", "cashflow_metrics", "credit_cards_metrics", "loans_metrics", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["accounts"]) -> MetaOapg.properties.accounts: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["transactions_metrics"]) -> 'RiskInsightsTransactionMetrics': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["balances_metrics"]) -> 'RiskInsightsBalanceMetrics': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cashflow_metrics"]) -> 'RiskInsightsCashflowMetrics': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["credit_cards_metrics"]) -> 'RiskInsightsCreditCardMetrics': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["loans_metrics"]) -> 'RiskInsightsLoansMetrics': ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "link", "accounts", "created_at", "transactions_metrics", "balances_metrics", "cashflow_metrics", "credit_cards_metrics", "loans_metrics", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        credit_cards_metrics: 'RiskInsightsCreditCardMetrics',
        link: typing.Union[MetaOapg.properties.link, str, uuid.UUID, ],
        transactions_metrics: 'RiskInsightsTransactionMetrics',
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, ],
        accounts: typing.Union[MetaOapg.properties.accounts, list, tuple, None, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, ],
        balances_metrics: 'RiskInsightsBalanceMetrics',
        loans_metrics: 'RiskInsightsLoansMetrics',
        cashflow_metrics: 'RiskInsightsCashflowMetrics',
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'RiskInsights':
        return super().__new__(
            cls,
            *args,
            credit_cards_metrics=credit_cards_metrics,
            link=link,
            transactions_metrics=transactions_metrics,
            created_at=created_at,
            accounts=accounts,
            id=id,
            balances_metrics=balances_metrics,
            loans_metrics=loans_metrics,
            cashflow_metrics=cashflow_metrics,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.risk_insights_balance_metrics import RiskInsightsBalanceMetrics
from belvo_client.model.risk_insights_cashflow_metrics import RiskInsightsCashflowMetrics
from belvo_client.model.risk_insights_credit_card_metrics import RiskInsightsCreditCardMetrics
from belvo_client.model.risk_insights_loans_metrics import RiskInsightsLoansMetrics
from belvo_client.model.risk_insights_transaction_metrics import RiskInsightsTransactionMetrics
