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

from belvo_client.model.balances_paginated_response import BalancesPaginatedResponse
from belvo_client.model.balances_list_response import BalancesListResponse

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
AccountInSchema = schemas.StrSchema
AccountTypeSchema = schemas.StrSchema
AccountTypeInSchema = schemas.StrSchema
BalanceSchema = schemas.StrSchema
BalanceLtSchema = schemas.StrSchema
BalanceLteSchema = schemas.StrSchema
BalanceGtSchema = schemas.StrSchema
BalanceGteSchema = schemas.StrSchema
BalanceRangeSchema = schemas.StrSchema
CurrencySchema = schemas.StrSchema
CurrencyInSchema = schemas.StrSchema
IdSchema = schemas.StrSchema
IdInSchema = schemas.StrSchema
InstitutionSchema = schemas.StrSchema
InstitutionInSchema = schemas.StrSchema
LinkInSchema = schemas.StrSchema
ValueDateSchema = schemas.StrSchema
ValueDateGtSchema = schemas.StrSchema
ValueDateGteSchema = schemas.StrSchema
ValueDateLtSchema = schemas.StrSchema
ValueDateLteSchema = schemas.StrSchema
ValueDateRangeSchema = schemas.StrSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'page': typing.Union[PageSchema, decimal.Decimal, int, ],
        'page_size': typing.Union[PageSizeSchema, decimal.Decimal, int, ],
        'omit': typing.Union[OmitSchema, str, ],
        'fields': typing.Union[FieldsSchema, str, ],
        'link': typing.Union[LinkSchema, str, uuid.UUID, ],
        'account': typing.Union[AccountSchema, str, uuid.UUID, ],
        'account__in': typing.Union[AccountInSchema, str, ],
        'account__type': typing.Union[AccountTypeSchema, str, ],
        'account__type__in': typing.Union[AccountTypeInSchema, str, ],
        'balance': typing.Union[BalanceSchema, str, ],
        'balance__lt': typing.Union[BalanceLtSchema, str, ],
        'balance__lte': typing.Union[BalanceLteSchema, str, ],
        'balance__gt': typing.Union[BalanceGtSchema, str, ],
        'balance__gte': typing.Union[BalanceGteSchema, str, ],
        'balance__range': typing.Union[BalanceRangeSchema, str, ],
        'currency': typing.Union[CurrencySchema, str, ],
        'currency__in': typing.Union[CurrencyInSchema, str, ],
        'id': typing.Union[IdSchema, str, ],
        'id__in': typing.Union[IdInSchema, str, ],
        'institution': typing.Union[InstitutionSchema, str, ],
        'institution__in': typing.Union[InstitutionInSchema, str, ],
        'link__in': typing.Union[LinkInSchema, str, ],
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
    explode=True,
)
request_query_account = api_client.QueryParameter(
    name="account",
    style=api_client.ParameterStyle.FORM,
    schema=AccountSchema,
    explode=True,
)
request_query_account__in = api_client.QueryParameter(
    name="account__in",
    style=api_client.ParameterStyle.FORM,
    schema=AccountInSchema,
    explode=True,
)
request_query_account__type = api_client.QueryParameter(
    name="account__type",
    style=api_client.ParameterStyle.FORM,
    schema=AccountTypeSchema,
    explode=True,
)
request_query_account__type__in = api_client.QueryParameter(
    name="account__type__in",
    style=api_client.ParameterStyle.FORM,
    schema=AccountTypeInSchema,
    explode=True,
)
request_query_balance = api_client.QueryParameter(
    name="balance",
    style=api_client.ParameterStyle.FORM,
    schema=BalanceSchema,
    explode=True,
)
request_query_balance__lt = api_client.QueryParameter(
    name="balance__lt",
    style=api_client.ParameterStyle.FORM,
    schema=BalanceLtSchema,
    explode=True,
)
request_query_balance__lte = api_client.QueryParameter(
    name="balance__lte",
    style=api_client.ParameterStyle.FORM,
    schema=BalanceLteSchema,
    explode=True,
)
request_query_balance__gt = api_client.QueryParameter(
    name="balance__gt",
    style=api_client.ParameterStyle.FORM,
    schema=BalanceGtSchema,
    explode=True,
)
request_query_balance__gte = api_client.QueryParameter(
    name="balance__gte",
    style=api_client.ParameterStyle.FORM,
    schema=BalanceGteSchema,
    explode=True,
)
request_query_balance__range = api_client.QueryParameter(
    name="balance__range",
    style=api_client.ParameterStyle.FORM,
    schema=BalanceRangeSchema,
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
request_query_id = api_client.QueryParameter(
    name="id",
    style=api_client.ParameterStyle.FORM,
    schema=IdSchema,
    explode=True,
)
request_query_id__in = api_client.QueryParameter(
    name="id__in",
    style=api_client.ParameterStyle.FORM,
    schema=IdInSchema,
    explode=True,
)
request_query_institution = api_client.QueryParameter(
    name="institution",
    style=api_client.ParameterStyle.FORM,
    schema=InstitutionSchema,
    explode=True,
)
request_query_institution__in = api_client.QueryParameter(
    name="institution__in",
    style=api_client.ParameterStyle.FORM,
    schema=InstitutionInSchema,
    explode=True,
)
request_query_link__in = api_client.QueryParameter(
    name="link__in",
    style=api_client.ParameterStyle.FORM,
    schema=LinkInSchema,
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
SchemaFor200ResponseBodyApplicationJson = BalancesPaginatedResponse


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: typing.Union[
        SchemaFor200ResponseBodyApplicationJson,
    ]


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
SchemaFor401ResponseBodyApplicationJson = BalancesListResponse


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    body: typing.Union[
        SchemaFor401ResponseBodyApplicationJson,
    ]


_response_for_401 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor401,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor401ResponseBodyApplicationJson),
    },
)
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):
    @typing.overload
    def _list_oapg(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
    ]: ...

    @typing.overload
    def _list_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _list_oapg(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _list_oapg(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        List all balances
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
            request_query_account__in,
            request_query_account__type,
            request_query_account__type__in,
            request_query_balance,
            request_query_balance__lt,
            request_query_balance__lte,
            request_query_balance__gt,
            request_query_balance__gte,
            request_query_balance__range,
            request_query_currency,
            request_query_currency__in,
            request_query_id,
            request_query_id__in,
            request_query_institution,
            request_query_institution__in,
            request_query_link__in,
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
            stream=stream,
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

    @typing.overload
    def list(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
    ]: ...

    @typing.overload
    def list(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def list(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def list(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._list_oapg(
            query_params=query_params,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
    ]: ...

    @typing.overload
    def get(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def get(
        self,
        query_params: RequestQueryParams = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._list_oapg(
            query_params=query_params,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


