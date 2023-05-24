# coding: utf-8

"""
    Belvo API Docs

    # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 

    The version of the OpenAPI document: 1.35.0
    Contact: support@belvo.com
    Created by: https://developers.belvo.com
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
import json
from urllib3._collections import HTTPHeaderDict

from belvo_client.api_response import AsyncGeneratorResponse
from belvo_client import api_client, exceptions
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

from belvo_client.model.transactions_list_response import TransactionsListResponse as TransactionsListResponseSchema
from belvo_client.model.transactions_paginated_response import TransactionsPaginatedResponse as TransactionsPaginatedResponseSchema

from belvo_client.type.transactions_paginated_response import TransactionsPaginatedResponse
from belvo_client.type.transactions_list_response import TransactionsListResponse

# Query params
PageSchema = schemas.Int32Schema


class PageSizeSchema(
    schemas.Int32Schema
):
    pass
OmitSchema = schemas.StrSchema
FieldsSchema = schemas.StrSchema
LinkSchema = schemas.UUIDSchema
AccountSchema = schemas.UUIDSchema
AccountBalanceAvailableSchema = schemas.StrSchema
AccountBalanceAvailableLtSchema = schemas.StrSchema
AccountBalanceAvailableLteSchema = schemas.StrSchema
AccountBalanceAvailableRangeSchema = schemas.StrSchema
AccountBalanceCurrentSchema = schemas.StrSchema
AccountBalanceCurrentGtSchema = schemas.StrSchema
AccountBalanceCurrentGteSchema = schemas.StrSchema
AccountBalanceCurrentLtSchema = schemas.StrSchema
AccountBalanceCurrentLteSchema = schemas.StrSchema
AccountBalanceCurrentRangeSchema = schemas.StrSchema
AccountInSchema = schemas.StrSchema
AccountTypeSchema = schemas.StrSchema
AccountTypeInSchema = schemas.StrSchema
AccountingDateSchema = schemas.StrSchema
AccountingDateGtSchema = schemas.StrSchema
AccountingDateGteSchema = schemas.StrSchema
AccountingDateLtSchema = schemas.StrSchema
AccountingDateLteSchema = schemas.StrSchema
AccountingDateRangeSchema = schemas.StrSchema
AmountSchema = schemas.StrSchema
AmountGtSchema = schemas.StrSchema
AmountGteSchema = schemas.StrSchema
AmountLtSchema = schemas.StrSchema
AmountLteSchema = schemas.StrSchema
AmountRangeSchema = schemas.StrSchema
CollectedAtSchema = schemas.StrSchema
CollectedAtGtSchema = schemas.StrSchema
CollectedAtGteSchema = schemas.StrSchema
CollectedAtLtSchema = schemas.StrSchema
CollectedAtLteSchema = schemas.StrSchema
CollectedAtRangeSchema = schemas.StrSchema
CreatedAtSchema = schemas.StrSchema
CreatedAtGtSchema = schemas.StrSchema
CreatedAtGteSchema = schemas.StrSchema
CreatedAtLtSchema = schemas.StrSchema
CreatedAtLteSchema = schemas.StrSchema
CreatedAtRangeSchema = schemas.StrSchema
CreditCardDataBillNameInSchema = schemas.StrSchema
CurrencySchema = schemas.StrSchema
CurrencyInSchema = schemas.StrSchema
ReferenceSchema = schemas.StrSchema
ReferenceInSchema = schemas.StrSchema
StatusSchema = schemas.StrSchema
StatusInSchema = schemas.StrSchema
TypeSchema = schemas.StrSchema
TypeInSchema = schemas.StrSchema
ValueDateSchema = schemas.StrSchema
ValueDateGtSchema = schemas.StrSchema
ValueDateGteSchema = schemas.StrSchema
ValueDateLtSchema = schemas.StrSchema
ValueDateLteSchema = schemas.StrSchema
ValueDateRangeSchema = schemas.StrSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
        'link': typing.Union[LinkSchema, str, uuid.UUID, ],
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'page': typing.Union[PageSchema, decimal.Decimal, int, ],
        'page_size': typing.Union[PageSizeSchema, decimal.Decimal, int, ],
        'omit': typing.Union[OmitSchema, str, ],
        'fields': typing.Union[FieldsSchema, str, ],
        'account': typing.Union[AccountSchema, str, uuid.UUID, ],
        'account__balance__available': typing.Union[AccountBalanceAvailableSchema, str, ],
        'account__balance__available__lt': typing.Union[AccountBalanceAvailableLtSchema, str, ],
        'account__balance__available__lte': typing.Union[AccountBalanceAvailableLteSchema, str, ],
        'account__balance__available__range': typing.Union[AccountBalanceAvailableRangeSchema, str, ],
        'account__balance__current': typing.Union[AccountBalanceCurrentSchema, str, ],
        'account__balance__current__gt': typing.Union[AccountBalanceCurrentGtSchema, str, ],
        'account__balance__current__gte': typing.Union[AccountBalanceCurrentGteSchema, str, ],
        'account__balance__current__lt': typing.Union[AccountBalanceCurrentLtSchema, str, ],
        'account__balance__current__lte': typing.Union[AccountBalanceCurrentLteSchema, str, ],
        'account__balance__current__range': typing.Union[AccountBalanceCurrentRangeSchema, str, ],
        'account__in': typing.Union[AccountInSchema, str, ],
        'account_type': typing.Union[AccountTypeSchema, str, ],
        'account_type__in': typing.Union[AccountTypeInSchema, str, ],
        'accounting_date': typing.Union[AccountingDateSchema, str, ],
        'accounting_date__gt': typing.Union[AccountingDateGtSchema, str, ],
        'accounting_date__gte': typing.Union[AccountingDateGteSchema, str, ],
        'accounting_date__lt': typing.Union[AccountingDateLtSchema, str, ],
        'accounting_date__lte': typing.Union[AccountingDateLteSchema, str, ],
        'accounting_date__range': typing.Union[AccountingDateRangeSchema, str, ],
        'amount': typing.Union[AmountSchema, str, ],
        'amount__gt': typing.Union[AmountGtSchema, str, ],
        'amount__gte': typing.Union[AmountGteSchema, str, ],
        'amount__lt': typing.Union[AmountLtSchema, str, ],
        'amount__lte': typing.Union[AmountLteSchema, str, ],
        'amount__range': typing.Union[AmountRangeSchema, str, ],
        'collected_at': typing.Union[CollectedAtSchema, str, ],
        'collected_at__gt': typing.Union[CollectedAtGtSchema, str, ],
        'collected_at__gte': typing.Union[CollectedAtGteSchema, str, ],
        'collected_at__lt': typing.Union[CollectedAtLtSchema, str, ],
        'collected_at__lte': typing.Union[CollectedAtLteSchema, str, ],
        'collected_at__range': typing.Union[CollectedAtRangeSchema, str, ],
        'created_at': typing.Union[CreatedAtSchema, str, ],
        'created_at__gt': typing.Union[CreatedAtGtSchema, str, ],
        'created_at__gte': typing.Union[CreatedAtGteSchema, str, ],
        'created_at__lt': typing.Union[CreatedAtLtSchema, str, ],
        'created_at__lte': typing.Union[CreatedAtLteSchema, str, ],
        'created_at__range': typing.Union[CreatedAtRangeSchema, str, ],
        'credit_card_data__bill_name__in': typing.Union[CreditCardDataBillNameInSchema, str, ],
        'currency': typing.Union[CurrencySchema, str, ],
        'currency__in': typing.Union[CurrencyInSchema, str, ],
        'reference': typing.Union[ReferenceSchema, str, ],
        'reference__in': typing.Union[ReferenceInSchema, str, ],
        'status': typing.Union[StatusSchema, str, ],
        'status__in': typing.Union[StatusInSchema, str, ],
        'type': typing.Union[TypeSchema, str, ],
        'type__in': typing.Union[TypeInSchema, str, ],
        'value_date': typing.Union[ValueDateSchema, str, ],
        'value_date__gt': typing.Union[ValueDateGtSchema, str, ],
        'value_date__gte': typing.Union[ValueDateGteSchema, str, ],
        'value_date__lt': typing.Union[ValueDateLtSchema, str, ],
        'value_date__lte': typing.Union[ValueDateLteSchema, str, ],
        'value_date__range': typing.Union[ValueDateRangeSchema, str, ],
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


request_query_page = api_client.QueryParameter(
    name="page",
    style=api_client.ParameterStyle.FORM,
    schema=PageSchema,
    explode=True,
)
request_query_page_size = api_client.QueryParameter(
    name="page_size",
    style=api_client.ParameterStyle.FORM,
    schema=PageSizeSchema,
    explode=True,
)
request_query_omit = api_client.QueryParameter(
    name="omit",
    style=api_client.ParameterStyle.FORM,
    schema=OmitSchema,
    explode=True,
)
request_query_fields = api_client.QueryParameter(
    name="fields",
    style=api_client.ParameterStyle.FORM,
    schema=FieldsSchema,
    explode=True,
)
request_query_link = api_client.QueryParameter(
    name="link",
    style=api_client.ParameterStyle.FORM,
    schema=LinkSchema,
    required=True,
    explode=True,
)
request_query_account = api_client.QueryParameter(
    name="account",
    style=api_client.ParameterStyle.FORM,
    schema=AccountSchema,
    explode=True,
)
request_query_account__balance__available = api_client.QueryParameter(
    name="account__balance__available",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceAvailableSchema,
    explode=True,
)
request_query_account__balance__available__lt = api_client.QueryParameter(
    name="account__balance__available__lt",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceAvailableLtSchema,
    explode=True,
)
request_query_account__balance__available__lte = api_client.QueryParameter(
    name="account__balance__available__lte",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceAvailableLteSchema,
    explode=True,
)
request_query_account__balance__available__range = api_client.QueryParameter(
    name="account__balance__available__range",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceAvailableRangeSchema,
    explode=True,
)
request_query_account__balance__current = api_client.QueryParameter(
    name="account__balance__current",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceCurrentSchema,
    explode=True,
)
request_query_account__balance__current__gt = api_client.QueryParameter(
    name="account__balance__current__gt",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceCurrentGtSchema,
    explode=True,
)
request_query_account__balance__current__gte = api_client.QueryParameter(
    name="account__balance__current__gte",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceCurrentGteSchema,
    explode=True,
)
request_query_account__balance__current__lt = api_client.QueryParameter(
    name="account__balance__current__lt",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceCurrentLtSchema,
    explode=True,
)
request_query_account__balance__current__lte = api_client.QueryParameter(
    name="account__balance__current__lte",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceCurrentLteSchema,
    explode=True,
)
request_query_account__balance__current__range = api_client.QueryParameter(
    name="account__balance__current__range",
    style=api_client.ParameterStyle.FORM,
    schema=AccountBalanceCurrentRangeSchema,
    explode=True,
)
request_query_account__in = api_client.QueryParameter(
    name="account__in",
    style=api_client.ParameterStyle.FORM,
    schema=AccountInSchema,
    explode=True,
)
request_query_account_type = api_client.QueryParameter(
    name="account_type",
    style=api_client.ParameterStyle.FORM,
    schema=AccountTypeSchema,
    explode=True,
)
request_query_account_type__in = api_client.QueryParameter(
    name="account_type__in",
    style=api_client.ParameterStyle.FORM,
    schema=AccountTypeInSchema,
    explode=True,
)
request_query_accounting_date = api_client.QueryParameter(
    name="accounting_date",
    style=api_client.ParameterStyle.FORM,
    schema=AccountingDateSchema,
    explode=True,
)
request_query_accounting_date__gt = api_client.QueryParameter(
    name="accounting_date__gt",
    style=api_client.ParameterStyle.FORM,
    schema=AccountingDateGtSchema,
    explode=True,
)
request_query_accounting_date__gte = api_client.QueryParameter(
    name="accounting_date__gte",
    style=api_client.ParameterStyle.FORM,
    schema=AccountingDateGteSchema,
    explode=True,
)
request_query_accounting_date__lt = api_client.QueryParameter(
    name="accounting_date__lt",
    style=api_client.ParameterStyle.FORM,
    schema=AccountingDateLtSchema,
    explode=True,
)
request_query_accounting_date__lte = api_client.QueryParameter(
    name="accounting_date__lte",
    style=api_client.ParameterStyle.FORM,
    schema=AccountingDateLteSchema,
    explode=True,
)
request_query_accounting_date__range = api_client.QueryParameter(
    name="accounting_date__range",
    style=api_client.ParameterStyle.FORM,
    schema=AccountingDateRangeSchema,
    explode=True,
)
request_query_amount = api_client.QueryParameter(
    name="amount",
    style=api_client.ParameterStyle.FORM,
    schema=AmountSchema,
    explode=True,
)
request_query_amount__gt = api_client.QueryParameter(
    name="amount__gt",
    style=api_client.ParameterStyle.FORM,
    schema=AmountGtSchema,
    explode=True,
)
request_query_amount__gte = api_client.QueryParameter(
    name="amount__gte",
    style=api_client.ParameterStyle.FORM,
    schema=AmountGteSchema,
    explode=True,
)
request_query_amount__lt = api_client.QueryParameter(
    name="amount__lt",
    style=api_client.ParameterStyle.FORM,
    schema=AmountLtSchema,
    explode=True,
)
request_query_amount__lte = api_client.QueryParameter(
    name="amount__lte",
    style=api_client.ParameterStyle.FORM,
    schema=AmountLteSchema,
    explode=True,
)
request_query_amount__range = api_client.QueryParameter(
    name="amount__range",
    style=api_client.ParameterStyle.FORM,
    schema=AmountRangeSchema,
    explode=True,
)
request_query_collected_at = api_client.QueryParameter(
    name="collected_at",
    style=api_client.ParameterStyle.FORM,
    schema=CollectedAtSchema,
    explode=True,
)
request_query_collected_at__gt = api_client.QueryParameter(
    name="collected_at__gt",
    style=api_client.ParameterStyle.FORM,
    schema=CollectedAtGtSchema,
    explode=True,
)
request_query_collected_at__gte = api_client.QueryParameter(
    name="collected_at__gte",
    style=api_client.ParameterStyle.FORM,
    schema=CollectedAtGteSchema,
    explode=True,
)
request_query_collected_at__lt = api_client.QueryParameter(
    name="collected_at__lt",
    style=api_client.ParameterStyle.FORM,
    schema=CollectedAtLtSchema,
    explode=True,
)
request_query_collected_at__lte = api_client.QueryParameter(
    name="collected_at__lte",
    style=api_client.ParameterStyle.FORM,
    schema=CollectedAtLteSchema,
    explode=True,
)
request_query_collected_at__range = api_client.QueryParameter(
    name="collected_at__range",
    style=api_client.ParameterStyle.FORM,
    schema=CollectedAtRangeSchema,
    explode=True,
)
request_query_created_at = api_client.QueryParameter(
    name="created_at",
    style=api_client.ParameterStyle.FORM,
    schema=CreatedAtSchema,
    explode=True,
)
request_query_created_at__gt = api_client.QueryParameter(
    name="created_at__gt",
    style=api_client.ParameterStyle.FORM,
    schema=CreatedAtGtSchema,
    explode=True,
)
request_query_created_at__gte = api_client.QueryParameter(
    name="created_at__gte",
    style=api_client.ParameterStyle.FORM,
    schema=CreatedAtGteSchema,
    explode=True,
)
request_query_created_at__lt = api_client.QueryParameter(
    name="created_at__lt",
    style=api_client.ParameterStyle.FORM,
    schema=CreatedAtLtSchema,
    explode=True,
)
request_query_created_at__lte = api_client.QueryParameter(
    name="created_at__lte",
    style=api_client.ParameterStyle.FORM,
    schema=CreatedAtLteSchema,
    explode=True,
)
request_query_created_at__range = api_client.QueryParameter(
    name="created_at__range",
    style=api_client.ParameterStyle.FORM,
    schema=CreatedAtRangeSchema,
    explode=True,
)
request_query_credit_card_data__bill_name__in = api_client.QueryParameter(
    name="credit_card_data__bill_name__in",
    style=api_client.ParameterStyle.FORM,
    schema=CreditCardDataBillNameInSchema,
    explode=True,
)
request_query_currency = api_client.QueryParameter(
    name="currency",
    style=api_client.ParameterStyle.FORM,
    schema=CurrencySchema,
    explode=True,
)
request_query_currency__in = api_client.QueryParameter(
    name="currency__in",
    style=api_client.ParameterStyle.FORM,
    schema=CurrencyInSchema,
    explode=True,
)
request_query_reference = api_client.QueryParameter(
    name="reference",
    style=api_client.ParameterStyle.FORM,
    schema=ReferenceSchema,
    explode=True,
)
request_query_reference__in = api_client.QueryParameter(
    name="reference__in",
    style=api_client.ParameterStyle.FORM,
    schema=ReferenceInSchema,
    explode=True,
)
request_query_status = api_client.QueryParameter(
    name="status",
    style=api_client.ParameterStyle.FORM,
    schema=StatusSchema,
    explode=True,
)
request_query_status__in = api_client.QueryParameter(
    name="status__in",
    style=api_client.ParameterStyle.FORM,
    schema=StatusInSchema,
    explode=True,
)
request_query_type = api_client.QueryParameter(
    name="type",
    style=api_client.ParameterStyle.FORM,
    schema=TypeSchema,
    explode=True,
)
request_query_type__in = api_client.QueryParameter(
    name="type__in",
    style=api_client.ParameterStyle.FORM,
    schema=TypeInSchema,
    explode=True,
)
request_query_value_date = api_client.QueryParameter(
    name="value_date",
    style=api_client.ParameterStyle.FORM,
    schema=ValueDateSchema,
    explode=True,
)
request_query_value_date__gt = api_client.QueryParameter(
    name="value_date__gt",
    style=api_client.ParameterStyle.FORM,
    schema=ValueDateGtSchema,
    explode=True,
)
request_query_value_date__gte = api_client.QueryParameter(
    name="value_date__gte",
    style=api_client.ParameterStyle.FORM,
    schema=ValueDateGteSchema,
    explode=True,
)
request_query_value_date__lt = api_client.QueryParameter(
    name="value_date__lt",
    style=api_client.ParameterStyle.FORM,
    schema=ValueDateLtSchema,
    explode=True,
)
request_query_value_date__lte = api_client.QueryParameter(
    name="value_date__lte",
    style=api_client.ParameterStyle.FORM,
    schema=ValueDateLteSchema,
    explode=True,
)
request_query_value_date__range = api_client.QueryParameter(
    name="value_date__range",
    style=api_client.ParameterStyle.FORM,
    schema=ValueDateRangeSchema,
    explode=True,
)
SchemaFor200ResponseBodyApplicationJson = TransactionsPaginatedResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: TransactionsPaginatedResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: TransactionsPaginatedResponse


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
SchemaFor401ResponseBodyApplicationJson = TransactionsListResponseSchema


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    body: TransactionsListResponse


@dataclass
class ApiResponseFor401Async(api_client.AsyncApiResponse):
    body: TransactionsListResponse


_response_for_401 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor401,
    response_cls_async=ApiResponseFor401Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor401ResponseBodyApplicationJson),
    },
)
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _list_mapped_args(
        self,
        link: str,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        account: typing.Optional[str] = None,
        account__balance__available: typing.Optional[str] = None,
        account__balance__available__lt: typing.Optional[str] = None,
        account__balance__available__lte: typing.Optional[str] = None,
        account__balance__available__range: typing.Optional[str] = None,
        account__balance__current: typing.Optional[str] = None,
        account__balance__current__gt: typing.Optional[str] = None,
        account__balance__current__gte: typing.Optional[str] = None,
        account__balance__current__lt: typing.Optional[str] = None,
        account__balance__current__lte: typing.Optional[str] = None,
        account__balance__current__range: typing.Optional[str] = None,
        account__in: typing.Optional[str] = None,
        account_type: typing.Optional[str] = None,
        account_type__in: typing.Optional[str] = None,
        accounting_date: typing.Optional[str] = None,
        accounting_date__gt: typing.Optional[str] = None,
        accounting_date__gte: typing.Optional[str] = None,
        accounting_date__lt: typing.Optional[str] = None,
        accounting_date__lte: typing.Optional[str] = None,
        accounting_date__range: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        amount__gt: typing.Optional[str] = None,
        amount__gte: typing.Optional[str] = None,
        amount__lt: typing.Optional[str] = None,
        amount__lte: typing.Optional[str] = None,
        amount__range: typing.Optional[str] = None,
        collected_at: typing.Optional[str] = None,
        collected_at__gt: typing.Optional[str] = None,
        collected_at__gte: typing.Optional[str] = None,
        collected_at__lt: typing.Optional[str] = None,
        collected_at__lte: typing.Optional[str] = None,
        collected_at__range: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
        credit_card_data__bill_name__in: typing.Optional[str] = None,
        currency: typing.Optional[str] = None,
        currency__in: typing.Optional[str] = None,
        reference: typing.Optional[str] = None,
        reference__in: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        value_date: typing.Optional[str] = None,
        value_date__gt: typing.Optional[str] = None,
        value_date__gte: typing.Optional[str] = None,
        value_date__lt: typing.Optional[str] = None,
        value_date__lte: typing.Optional[str] = None,
        value_date__range: typing.Optional[str] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _query_params = {}
        if page is not None:
            _query_params["page"] = page
        if page_size is not None:
            _query_params["page_size"] = page_size
        if omit is not None:
            _query_params["omit"] = omit
        if fields is not None:
            _query_params["fields"] = fields
        if link is not None:
            _query_params["link"] = link
        if account is not None:
            _query_params["account"] = account
        if account__balance__available is not None:
            _query_params["account__balance__available"] = account__balance__available
        if account__balance__available__lt is not None:
            _query_params["account__balance__available__lt"] = account__balance__available__lt
        if account__balance__available__lte is not None:
            _query_params["account__balance__available__lte"] = account__balance__available__lte
        if account__balance__available__range is not None:
            _query_params["account__balance__available__range"] = account__balance__available__range
        if account__balance__current is not None:
            _query_params["account__balance__current"] = account__balance__current
        if account__balance__current__gt is not None:
            _query_params["account__balance__current__gt"] = account__balance__current__gt
        if account__balance__current__gte is not None:
            _query_params["account__balance__current__gte"] = account__balance__current__gte
        if account__balance__current__lt is not None:
            _query_params["account__balance__current__lt"] = account__balance__current__lt
        if account__balance__current__lte is not None:
            _query_params["account__balance__current__lte"] = account__balance__current__lte
        if account__balance__current__range is not None:
            _query_params["account__balance__current__range"] = account__balance__current__range
        if account__in is not None:
            _query_params["account__in"] = account__in
        if account_type is not None:
            _query_params["account_type"] = account_type
        if account_type__in is not None:
            _query_params["account_type__in"] = account_type__in
        if accounting_date is not None:
            _query_params["accounting_date"] = accounting_date
        if accounting_date__gt is not None:
            _query_params["accounting_date__gt"] = accounting_date__gt
        if accounting_date__gte is not None:
            _query_params["accounting_date__gte"] = accounting_date__gte
        if accounting_date__lt is not None:
            _query_params["accounting_date__lt"] = accounting_date__lt
        if accounting_date__lte is not None:
            _query_params["accounting_date__lte"] = accounting_date__lte
        if accounting_date__range is not None:
            _query_params["accounting_date__range"] = accounting_date__range
        if amount is not None:
            _query_params["amount"] = amount
        if amount__gt is not None:
            _query_params["amount__gt"] = amount__gt
        if amount__gte is not None:
            _query_params["amount__gte"] = amount__gte
        if amount__lt is not None:
            _query_params["amount__lt"] = amount__lt
        if amount__lte is not None:
            _query_params["amount__lte"] = amount__lte
        if amount__range is not None:
            _query_params["amount__range"] = amount__range
        if collected_at is not None:
            _query_params["collected_at"] = collected_at
        if collected_at__gt is not None:
            _query_params["collected_at__gt"] = collected_at__gt
        if collected_at__gte is not None:
            _query_params["collected_at__gte"] = collected_at__gte
        if collected_at__lt is not None:
            _query_params["collected_at__lt"] = collected_at__lt
        if collected_at__lte is not None:
            _query_params["collected_at__lte"] = collected_at__lte
        if collected_at__range is not None:
            _query_params["collected_at__range"] = collected_at__range
        if created_at is not None:
            _query_params["created_at"] = created_at
        if created_at__gt is not None:
            _query_params["created_at__gt"] = created_at__gt
        if created_at__gte is not None:
            _query_params["created_at__gte"] = created_at__gte
        if created_at__lt is not None:
            _query_params["created_at__lt"] = created_at__lt
        if created_at__lte is not None:
            _query_params["created_at__lte"] = created_at__lte
        if created_at__range is not None:
            _query_params["created_at__range"] = created_at__range
        if credit_card_data__bill_name__in is not None:
            _query_params["credit_card_data__bill_name__in"] = credit_card_data__bill_name__in
        if currency is not None:
            _query_params["currency"] = currency
        if currency__in is not None:
            _query_params["currency__in"] = currency__in
        if reference is not None:
            _query_params["reference"] = reference
        if reference__in is not None:
            _query_params["reference__in"] = reference__in
        if status is not None:
            _query_params["status"] = status
        if status__in is not None:
            _query_params["status__in"] = status__in
        if type is not None:
            _query_params["type"] = type
        if type__in is not None:
            _query_params["type__in"] = type__in
        if value_date is not None:
            _query_params["value_date"] = value_date
        if value_date__gt is not None:
            _query_params["value_date__gt"] = value_date__gt
        if value_date__gte is not None:
            _query_params["value_date__gte"] = value_date__gte
        if value_date__lt is not None:
            _query_params["value_date__lt"] = value_date__lt
        if value_date__lte is not None:
            _query_params["value_date__lte"] = value_date__lte
        if value_date__range is not None:
            _query_params["value_date__range"] = value_date__range
        args.query = _query_params
        return args

    async def _alist_oapg(
        self,
            query_params: typing.Optional[dict] = {},
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        List all transactions
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_page,
            request_query_page_size,
            request_query_omit,
            request_query_fields,
            request_query_link,
            request_query_account,
            request_query_account__balance__available,
            request_query_account__balance__available__lt,
            request_query_account__balance__available__lte,
            request_query_account__balance__available__range,
            request_query_account__balance__current,
            request_query_account__balance__current__gt,
            request_query_account__balance__current__gte,
            request_query_account__balance__current__lt,
            request_query_account__balance__current__lte,
            request_query_account__balance__current__range,
            request_query_account__in,
            request_query_account_type,
            request_query_account_type__in,
            request_query_accounting_date,
            request_query_accounting_date__gt,
            request_query_accounting_date__gte,
            request_query_accounting_date__lt,
            request_query_accounting_date__lte,
            request_query_accounting_date__range,
            request_query_amount,
            request_query_amount__gt,
            request_query_amount__gte,
            request_query_amount__lt,
            request_query_amount__lte,
            request_query_amount__range,
            request_query_collected_at,
            request_query_collected_at__gt,
            request_query_collected_at__gte,
            request_query_collected_at__lt,
            request_query_collected_at__lte,
            request_query_collected_at__range,
            request_query_created_at,
            request_query_created_at__gt,
            request_query_created_at__gte,
            request_query_created_at__lt,
            request_query_created_at__lte,
            request_query_created_at__range,
            request_query_credit_card_data__bill_name__in,
            request_query_currency,
            request_query_currency__in,
            request_query_reference,
            request_query_reference__in,
            request_query_status,
            request_query_status__in,
            request_query_type,
            request_query_type__in,
            request_query_value_date,
            request_query_value_date__gt,
            request_query_value_date__gte,
            request_query_value_date__lt,
            request_query_value_date__lte,
            request_query_value_date__range,
        ):
            parameter_data = query_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            if prefix_separator_iterator is None:
                prefix_separator_iterator = parameter.get_prefix_separator_iterator()
            serialized_data = parameter.serialize(parameter_data, prefix_separator_iterator)
            for serialized_value in serialized_data.values():
                used_path += serialized_value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method='get'.upper(),
            headers=_headers,
            auth_settings=_auth,
            prefix_separator_iterator=prefix_separator_iterator,
            timeout=timeout,
        )
        
        if stream:
            async def stream_iterator():
                """
                iterates over response.http_response.content and closes connection once iteration has finished
                """
                async for line in response.http_response.content:
                    if line == b'\r\n':
                        continue
                    yield line
                response.http_response.close()
                await response.session.close()
            return AsyncGeneratorResponse(
                content=stream_iterator(),
                headers=response.http_response.headers,
                status=response.http_response.status,
                response=response.http_response
            )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = await response_for_status.deserialize_async(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserializationAsync(
                body=await response.http_response.json() if is_json else await response.http_response.text(),
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        # cleanup session / response
        response.http_response.close()
        await response.session.close()
    
        return api_response

    def _list_oapg(
        self,
            query_params: typing.Optional[dict] = {},
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        List all transactions
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_page,
            request_query_page_size,
            request_query_omit,
            request_query_fields,
            request_query_link,
            request_query_account,
            request_query_account__balance__available,
            request_query_account__balance__available__lt,
            request_query_account__balance__available__lte,
            request_query_account__balance__available__range,
            request_query_account__balance__current,
            request_query_account__balance__current__gt,
            request_query_account__balance__current__gte,
            request_query_account__balance__current__lt,
            request_query_account__balance__current__lte,
            request_query_account__balance__current__range,
            request_query_account__in,
            request_query_account_type,
            request_query_account_type__in,
            request_query_accounting_date,
            request_query_accounting_date__gt,
            request_query_accounting_date__gte,
            request_query_accounting_date__lt,
            request_query_accounting_date__lte,
            request_query_accounting_date__range,
            request_query_amount,
            request_query_amount__gt,
            request_query_amount__gte,
            request_query_amount__lt,
            request_query_amount__lte,
            request_query_amount__range,
            request_query_collected_at,
            request_query_collected_at__gt,
            request_query_collected_at__gte,
            request_query_collected_at__lt,
            request_query_collected_at__lte,
            request_query_collected_at__range,
            request_query_created_at,
            request_query_created_at__gt,
            request_query_created_at__gte,
            request_query_created_at__lt,
            request_query_created_at__lte,
            request_query_created_at__range,
            request_query_credit_card_data__bill_name__in,
            request_query_currency,
            request_query_currency__in,
            request_query_reference,
            request_query_reference__in,
            request_query_status,
            request_query_status__in,
            request_query_type,
            request_query_type__in,
            request_query_value_date,
            request_query_value_date__gt,
            request_query_value_date__gte,
            request_query_value_date__lt,
            request_query_value_date__lte,
            request_query_value_date__range,
        ):
            parameter_data = query_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            if prefix_separator_iterator is None:
                prefix_separator_iterator = parameter.get_prefix_separator_iterator()
            serialized_data = parameter.serialize(parameter_data, prefix_separator_iterator)
            for serialized_value in serialized_data.values():
                used_path += serialized_value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
    
        response = self.api_client.call_api(
            resource_path=used_path,
            method='get'.upper(),
            headers=_headers,
            auth_settings=_auth,
            prefix_separator_iterator=prefix_separator_iterator,
            timeout=timeout,
        )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = response_for_status.deserialize(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserialization(
                body=json.loads(response.http_response.data) if is_json else response.http_response.data,
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        return api_response

class List(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def alist(
        self,
        link: str,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        account: typing.Optional[str] = None,
        account__balance__available: typing.Optional[str] = None,
        account__balance__available__lt: typing.Optional[str] = None,
        account__balance__available__lte: typing.Optional[str] = None,
        account__balance__available__range: typing.Optional[str] = None,
        account__balance__current: typing.Optional[str] = None,
        account__balance__current__gt: typing.Optional[str] = None,
        account__balance__current__gte: typing.Optional[str] = None,
        account__balance__current__lt: typing.Optional[str] = None,
        account__balance__current__lte: typing.Optional[str] = None,
        account__balance__current__range: typing.Optional[str] = None,
        account__in: typing.Optional[str] = None,
        account_type: typing.Optional[str] = None,
        account_type__in: typing.Optional[str] = None,
        accounting_date: typing.Optional[str] = None,
        accounting_date__gt: typing.Optional[str] = None,
        accounting_date__gte: typing.Optional[str] = None,
        accounting_date__lt: typing.Optional[str] = None,
        accounting_date__lte: typing.Optional[str] = None,
        accounting_date__range: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        amount__gt: typing.Optional[str] = None,
        amount__gte: typing.Optional[str] = None,
        amount__lt: typing.Optional[str] = None,
        amount__lte: typing.Optional[str] = None,
        amount__range: typing.Optional[str] = None,
        collected_at: typing.Optional[str] = None,
        collected_at__gt: typing.Optional[str] = None,
        collected_at__gte: typing.Optional[str] = None,
        collected_at__lt: typing.Optional[str] = None,
        collected_at__lte: typing.Optional[str] = None,
        collected_at__range: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
        credit_card_data__bill_name__in: typing.Optional[str] = None,
        currency: typing.Optional[str] = None,
        currency__in: typing.Optional[str] = None,
        reference: typing.Optional[str] = None,
        reference__in: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        value_date: typing.Optional[str] = None,
        value_date__gt: typing.Optional[str] = None,
        value_date__gte: typing.Optional[str] = None,
        value_date__lt: typing.Optional[str] = None,
        value_date__lte: typing.Optional[str] = None,
        value_date__range: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._list_mapped_args(
            link=link,
            page=page,
            page_size=page_size,
            omit=omit,
            fields=fields,
            account=account,
            account__balance__available=account__balance__available,
            account__balance__available__lt=account__balance__available__lt,
            account__balance__available__lte=account__balance__available__lte,
            account__balance__available__range=account__balance__available__range,
            account__balance__current=account__balance__current,
            account__balance__current__gt=account__balance__current__gt,
            account__balance__current__gte=account__balance__current__gte,
            account__balance__current__lt=account__balance__current__lt,
            account__balance__current__lte=account__balance__current__lte,
            account__balance__current__range=account__balance__current__range,
            account__in=account__in,
            account_type=account_type,
            account_type__in=account_type__in,
            accounting_date=accounting_date,
            accounting_date__gt=accounting_date__gt,
            accounting_date__gte=accounting_date__gte,
            accounting_date__lt=accounting_date__lt,
            accounting_date__lte=accounting_date__lte,
            accounting_date__range=accounting_date__range,
            amount=amount,
            amount__gt=amount__gt,
            amount__gte=amount__gte,
            amount__lt=amount__lt,
            amount__lte=amount__lte,
            amount__range=amount__range,
            collected_at=collected_at,
            collected_at__gt=collected_at__gt,
            collected_at__gte=collected_at__gte,
            collected_at__lt=collected_at__lt,
            collected_at__lte=collected_at__lte,
            collected_at__range=collected_at__range,
            created_at=created_at,
            created_at__gt=created_at__gt,
            created_at__gte=created_at__gte,
            created_at__lt=created_at__lt,
            created_at__lte=created_at__lte,
            created_at__range=created_at__range,
            credit_card_data__bill_name__in=credit_card_data__bill_name__in,
            currency=currency,
            currency__in=currency__in,
            reference=reference,
            reference__in=reference__in,
            status=status,
            status__in=status__in,
            type=type,
            type__in=type__in,
            value_date=value_date,
            value_date__gt=value_date__gt,
            value_date__gte=value_date__gte,
            value_date__lt=value_date__lt,
            value_date__lte=value_date__lte,
            value_date__range=value_date__range,
        )
        return await self._alist_oapg(
            query_params=args.query,
        )
    
    def list(
        self,
        link: str,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        account: typing.Optional[str] = None,
        account__balance__available: typing.Optional[str] = None,
        account__balance__available__lt: typing.Optional[str] = None,
        account__balance__available__lte: typing.Optional[str] = None,
        account__balance__available__range: typing.Optional[str] = None,
        account__balance__current: typing.Optional[str] = None,
        account__balance__current__gt: typing.Optional[str] = None,
        account__balance__current__gte: typing.Optional[str] = None,
        account__balance__current__lt: typing.Optional[str] = None,
        account__balance__current__lte: typing.Optional[str] = None,
        account__balance__current__range: typing.Optional[str] = None,
        account__in: typing.Optional[str] = None,
        account_type: typing.Optional[str] = None,
        account_type__in: typing.Optional[str] = None,
        accounting_date: typing.Optional[str] = None,
        accounting_date__gt: typing.Optional[str] = None,
        accounting_date__gte: typing.Optional[str] = None,
        accounting_date__lt: typing.Optional[str] = None,
        accounting_date__lte: typing.Optional[str] = None,
        accounting_date__range: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        amount__gt: typing.Optional[str] = None,
        amount__gte: typing.Optional[str] = None,
        amount__lt: typing.Optional[str] = None,
        amount__lte: typing.Optional[str] = None,
        amount__range: typing.Optional[str] = None,
        collected_at: typing.Optional[str] = None,
        collected_at__gt: typing.Optional[str] = None,
        collected_at__gte: typing.Optional[str] = None,
        collected_at__lt: typing.Optional[str] = None,
        collected_at__lte: typing.Optional[str] = None,
        collected_at__range: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
        credit_card_data__bill_name__in: typing.Optional[str] = None,
        currency: typing.Optional[str] = None,
        currency__in: typing.Optional[str] = None,
        reference: typing.Optional[str] = None,
        reference__in: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        value_date: typing.Optional[str] = None,
        value_date__gt: typing.Optional[str] = None,
        value_date__gte: typing.Optional[str] = None,
        value_date__lt: typing.Optional[str] = None,
        value_date__lte: typing.Optional[str] = None,
        value_date__range: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._list_mapped_args(
            link=link,
            page=page,
            page_size=page_size,
            omit=omit,
            fields=fields,
            account=account,
            account__balance__available=account__balance__available,
            account__balance__available__lt=account__balance__available__lt,
            account__balance__available__lte=account__balance__available__lte,
            account__balance__available__range=account__balance__available__range,
            account__balance__current=account__balance__current,
            account__balance__current__gt=account__balance__current__gt,
            account__balance__current__gte=account__balance__current__gte,
            account__balance__current__lt=account__balance__current__lt,
            account__balance__current__lte=account__balance__current__lte,
            account__balance__current__range=account__balance__current__range,
            account__in=account__in,
            account_type=account_type,
            account_type__in=account_type__in,
            accounting_date=accounting_date,
            accounting_date__gt=accounting_date__gt,
            accounting_date__gte=accounting_date__gte,
            accounting_date__lt=accounting_date__lt,
            accounting_date__lte=accounting_date__lte,
            accounting_date__range=accounting_date__range,
            amount=amount,
            amount__gt=amount__gt,
            amount__gte=amount__gte,
            amount__lt=amount__lt,
            amount__lte=amount__lte,
            amount__range=amount__range,
            collected_at=collected_at,
            collected_at__gt=collected_at__gt,
            collected_at__gte=collected_at__gte,
            collected_at__lt=collected_at__lt,
            collected_at__lte=collected_at__lte,
            collected_at__range=collected_at__range,
            created_at=created_at,
            created_at__gt=created_at__gt,
            created_at__gte=created_at__gte,
            created_at__lt=created_at__lt,
            created_at__lte=created_at__lte,
            created_at__range=created_at__range,
            credit_card_data__bill_name__in=credit_card_data__bill_name__in,
            currency=currency,
            currency__in=currency__in,
            reference=reference,
            reference__in=reference__in,
            status=status,
            status__in=status__in,
            type=type,
            type__in=type__in,
            value_date=value_date,
            value_date__gt=value_date__gt,
            value_date__gte=value_date__gte,
            value_date__lt=value_date__lt,
            value_date__lte=value_date__lte,
            value_date__range=value_date__range,
        )
        return self._list_oapg(
            query_params=args.query,
        )

class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aget(
        self,
        link: str,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        account: typing.Optional[str] = None,
        account__balance__available: typing.Optional[str] = None,
        account__balance__available__lt: typing.Optional[str] = None,
        account__balance__available__lte: typing.Optional[str] = None,
        account__balance__available__range: typing.Optional[str] = None,
        account__balance__current: typing.Optional[str] = None,
        account__balance__current__gt: typing.Optional[str] = None,
        account__balance__current__gte: typing.Optional[str] = None,
        account__balance__current__lt: typing.Optional[str] = None,
        account__balance__current__lte: typing.Optional[str] = None,
        account__balance__current__range: typing.Optional[str] = None,
        account__in: typing.Optional[str] = None,
        account_type: typing.Optional[str] = None,
        account_type__in: typing.Optional[str] = None,
        accounting_date: typing.Optional[str] = None,
        accounting_date__gt: typing.Optional[str] = None,
        accounting_date__gte: typing.Optional[str] = None,
        accounting_date__lt: typing.Optional[str] = None,
        accounting_date__lte: typing.Optional[str] = None,
        accounting_date__range: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        amount__gt: typing.Optional[str] = None,
        amount__gte: typing.Optional[str] = None,
        amount__lt: typing.Optional[str] = None,
        amount__lte: typing.Optional[str] = None,
        amount__range: typing.Optional[str] = None,
        collected_at: typing.Optional[str] = None,
        collected_at__gt: typing.Optional[str] = None,
        collected_at__gte: typing.Optional[str] = None,
        collected_at__lt: typing.Optional[str] = None,
        collected_at__lte: typing.Optional[str] = None,
        collected_at__range: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
        credit_card_data__bill_name__in: typing.Optional[str] = None,
        currency: typing.Optional[str] = None,
        currency__in: typing.Optional[str] = None,
        reference: typing.Optional[str] = None,
        reference__in: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        value_date: typing.Optional[str] = None,
        value_date__gt: typing.Optional[str] = None,
        value_date__gte: typing.Optional[str] = None,
        value_date__lt: typing.Optional[str] = None,
        value_date__lte: typing.Optional[str] = None,
        value_date__range: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._list_mapped_args(
            link=link,
            page=page,
            page_size=page_size,
            omit=omit,
            fields=fields,
            account=account,
            account__balance__available=account__balance__available,
            account__balance__available__lt=account__balance__available__lt,
            account__balance__available__lte=account__balance__available__lte,
            account__balance__available__range=account__balance__available__range,
            account__balance__current=account__balance__current,
            account__balance__current__gt=account__balance__current__gt,
            account__balance__current__gte=account__balance__current__gte,
            account__balance__current__lt=account__balance__current__lt,
            account__balance__current__lte=account__balance__current__lte,
            account__balance__current__range=account__balance__current__range,
            account__in=account__in,
            account_type=account_type,
            account_type__in=account_type__in,
            accounting_date=accounting_date,
            accounting_date__gt=accounting_date__gt,
            accounting_date__gte=accounting_date__gte,
            accounting_date__lt=accounting_date__lt,
            accounting_date__lte=accounting_date__lte,
            accounting_date__range=accounting_date__range,
            amount=amount,
            amount__gt=amount__gt,
            amount__gte=amount__gte,
            amount__lt=amount__lt,
            amount__lte=amount__lte,
            amount__range=amount__range,
            collected_at=collected_at,
            collected_at__gt=collected_at__gt,
            collected_at__gte=collected_at__gte,
            collected_at__lt=collected_at__lt,
            collected_at__lte=collected_at__lte,
            collected_at__range=collected_at__range,
            created_at=created_at,
            created_at__gt=created_at__gt,
            created_at__gte=created_at__gte,
            created_at__lt=created_at__lt,
            created_at__lte=created_at__lte,
            created_at__range=created_at__range,
            credit_card_data__bill_name__in=credit_card_data__bill_name__in,
            currency=currency,
            currency__in=currency__in,
            reference=reference,
            reference__in=reference__in,
            status=status,
            status__in=status__in,
            type=type,
            type__in=type__in,
            value_date=value_date,
            value_date__gt=value_date__gt,
            value_date__gte=value_date__gte,
            value_date__lt=value_date__lt,
            value_date__lte=value_date__lte,
            value_date__range=value_date__range,
        )
        return await self._alist_oapg(
            query_params=args.query,
        )
    
    def get(
        self,
        link: str,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        account: typing.Optional[str] = None,
        account__balance__available: typing.Optional[str] = None,
        account__balance__available__lt: typing.Optional[str] = None,
        account__balance__available__lte: typing.Optional[str] = None,
        account__balance__available__range: typing.Optional[str] = None,
        account__balance__current: typing.Optional[str] = None,
        account__balance__current__gt: typing.Optional[str] = None,
        account__balance__current__gte: typing.Optional[str] = None,
        account__balance__current__lt: typing.Optional[str] = None,
        account__balance__current__lte: typing.Optional[str] = None,
        account__balance__current__range: typing.Optional[str] = None,
        account__in: typing.Optional[str] = None,
        account_type: typing.Optional[str] = None,
        account_type__in: typing.Optional[str] = None,
        accounting_date: typing.Optional[str] = None,
        accounting_date__gt: typing.Optional[str] = None,
        accounting_date__gte: typing.Optional[str] = None,
        accounting_date__lt: typing.Optional[str] = None,
        accounting_date__lte: typing.Optional[str] = None,
        accounting_date__range: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        amount__gt: typing.Optional[str] = None,
        amount__gte: typing.Optional[str] = None,
        amount__lt: typing.Optional[str] = None,
        amount__lte: typing.Optional[str] = None,
        amount__range: typing.Optional[str] = None,
        collected_at: typing.Optional[str] = None,
        collected_at__gt: typing.Optional[str] = None,
        collected_at__gte: typing.Optional[str] = None,
        collected_at__lt: typing.Optional[str] = None,
        collected_at__lte: typing.Optional[str] = None,
        collected_at__range: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
        credit_card_data__bill_name__in: typing.Optional[str] = None,
        currency: typing.Optional[str] = None,
        currency__in: typing.Optional[str] = None,
        reference: typing.Optional[str] = None,
        reference__in: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        value_date: typing.Optional[str] = None,
        value_date__gt: typing.Optional[str] = None,
        value_date__gte: typing.Optional[str] = None,
        value_date__lt: typing.Optional[str] = None,
        value_date__lte: typing.Optional[str] = None,
        value_date__range: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._list_mapped_args(
            link=link,
            page=page,
            page_size=page_size,
            omit=omit,
            fields=fields,
            account=account,
            account__balance__available=account__balance__available,
            account__balance__available__lt=account__balance__available__lt,
            account__balance__available__lte=account__balance__available__lte,
            account__balance__available__range=account__balance__available__range,
            account__balance__current=account__balance__current,
            account__balance__current__gt=account__balance__current__gt,
            account__balance__current__gte=account__balance__current__gte,
            account__balance__current__lt=account__balance__current__lt,
            account__balance__current__lte=account__balance__current__lte,
            account__balance__current__range=account__balance__current__range,
            account__in=account__in,
            account_type=account_type,
            account_type__in=account_type__in,
            accounting_date=accounting_date,
            accounting_date__gt=accounting_date__gt,
            accounting_date__gte=accounting_date__gte,
            accounting_date__lt=accounting_date__lt,
            accounting_date__lte=accounting_date__lte,
            accounting_date__range=accounting_date__range,
            amount=amount,
            amount__gt=amount__gt,
            amount__gte=amount__gte,
            amount__lt=amount__lt,
            amount__lte=amount__lte,
            amount__range=amount__range,
            collected_at=collected_at,
            collected_at__gt=collected_at__gt,
            collected_at__gte=collected_at__gte,
            collected_at__lt=collected_at__lt,
            collected_at__lte=collected_at__lte,
            collected_at__range=collected_at__range,
            created_at=created_at,
            created_at__gt=created_at__gt,
            created_at__gte=created_at__gte,
            created_at__lt=created_at__lt,
            created_at__lte=created_at__lte,
            created_at__range=created_at__range,
            credit_card_data__bill_name__in=credit_card_data__bill_name__in,
            currency=currency,
            currency__in=currency__in,
            reference=reference,
            reference__in=reference__in,
            status=status,
            status__in=status__in,
            type=type,
            type__in=type__in,
            value_date=value_date,
            value_date__gt=value_date__gt,
            value_date__gte=value_date__gte,
            value_date__lt=value_date__lt,
            value_date__lte=value_date__lte,
            value_date__range=value_date__range,
        )
        return self._list_oapg(
            query_params=args.query,
        )

