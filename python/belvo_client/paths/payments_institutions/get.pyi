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

from belvo_client.model.payments_institutions_paginated_response import PaymentsInstitutionsPaginatedResponse as PaymentsInstitutionsPaginatedResponseSchema
from belvo_client.model.payment_institutions_list_response import PaymentInstitutionsListResponse as PaymentInstitutionsListResponseSchema

from belvo_client.type.payment_institutions_list_response import PaymentInstitutionsListResponse
from belvo_client.type.payments_institutions_paginated_response import PaymentsInstitutionsPaginatedResponse

# Query params
PageSchema = schemas.Int32Schema
CountrySchema = schemas.StrSchema
CountryInSchema = schemas.StrSchema
CreatedAtSchema = schemas.StrSchema
CreatedAtGtSchema = schemas.StrSchema
CreatedAtGteSchema = schemas.StrSchema
CreatedAtLtSchema = schemas.StrSchema
CreatedAtLteSchema = schemas.StrSchema
CreatedAtRangeSchema = schemas.StrSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'page': typing.Union[PageSchema, decimal.Decimal, int, ],
        'country': typing.Union[CountrySchema, str, ],
        'country__in': typing.Union[CountryInSchema, str, ],
        'created_at': typing.Union[CreatedAtSchema, str, ],
        'created_at__gt': typing.Union[CreatedAtGtSchema, str, ],
        'created_at__gte': typing.Union[CreatedAtGteSchema, str, ],
        'created_at__lt': typing.Union[CreatedAtLtSchema, str, ],
        'created_at__lte': typing.Union[CreatedAtLteSchema, str, ],
        'created_at__range': typing.Union[CreatedAtRangeSchema, str, ],
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
request_query_country = api_client.QueryParameter(
    name="country",
    style=api_client.ParameterStyle.FORM,
    schema=CountrySchema,
    explode=True,
)
request_query_country__in = api_client.QueryParameter(
    name="country__in",
    style=api_client.ParameterStyle.FORM,
    schema=CountryInSchema,
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
SchemaFor200ResponseBodyApplicationJson = PaymentsInstitutionsPaginatedResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: PaymentsInstitutionsPaginatedResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: PaymentsInstitutionsPaginatedResponse


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
SchemaFor401ResponseBodyApplicationJson = PaymentInstitutionsListResponseSchema


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    body: PaymentInstitutionsListResponse


@dataclass
class ApiResponseFor401Async(api_client.AsyncApiResponse):
    body: PaymentInstitutionsListResponse


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
        page: typing.Optional[int] = None,
        country: typing.Optional[str] = None,
        country__in: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _query_params = {}
        if page is not None:
            _query_params["page"] = page
        if country is not None:
            _query_params["country"] = country
        if country__in is not None:
            _query_params["country__in"] = country__in
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
        List all payment institutions
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_page,
            request_query_country,
            request_query_country__in,
            request_query_created_at,
            request_query_created_at__gt,
            request_query_created_at__gte,
            request_query_created_at__lt,
            request_query_created_at__lte,
            request_query_created_at__range,
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
        List all payment institutions
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_page,
            request_query_country,
            request_query_country__in,
            request_query_created_at,
            request_query_created_at__gt,
            request_query_created_at__gte,
            request_query_created_at__lt,
            request_query_created_at__lte,
            request_query_created_at__range,
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
        page: typing.Optional[int] = None,
        country: typing.Optional[str] = None,
        country__in: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._list_mapped_args(
            page=page,
            country=country,
            country__in=country__in,
            created_at=created_at,
            created_at__gt=created_at__gt,
            created_at__gte=created_at__gte,
            created_at__lt=created_at__lt,
            created_at__lte=created_at__lte,
            created_at__range=created_at__range,
        )
        return await self._alist_oapg(
            query_params=args.query,
        )
    
    def list(
        self,
        page: typing.Optional[int] = None,
        country: typing.Optional[str] = None,
        country__in: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._list_mapped_args(
            page=page,
            country=country,
            country__in=country__in,
            created_at=created_at,
            created_at__gt=created_at__gt,
            created_at__gte=created_at__gte,
            created_at__lt=created_at__lt,
            created_at__lte=created_at__lte,
            created_at__range=created_at__range,
        )
        return self._list_oapg(
            query_params=args.query,
        )

class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aget(
        self,
        page: typing.Optional[int] = None,
        country: typing.Optional[str] = None,
        country__in: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._list_mapped_args(
            page=page,
            country=country,
            country__in=country__in,
            created_at=created_at,
            created_at__gt=created_at__gt,
            created_at__gte=created_at__gte,
            created_at__lt=created_at__lt,
            created_at__lte=created_at__lte,
            created_at__range=created_at__range,
        )
        return await self._alist_oapg(
            query_params=args.query,
        )
    
    def get(
        self,
        page: typing.Optional[int] = None,
        country: typing.Optional[str] = None,
        country__in: typing.Optional[str] = None,
        created_at: typing.Optional[str] = None,
        created_at__gt: typing.Optional[str] = None,
        created_at__gte: typing.Optional[str] = None,
        created_at__lt: typing.Optional[str] = None,
        created_at__lte: typing.Optional[str] = None,
        created_at__range: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._list_mapped_args(
            page=page,
            country=country,
            country__in=country__in,
            created_at=created_at,
            created_at__gt=created_at__gt,
            created_at__gte=created_at__gte,
            created_at__lt=created_at__lt,
            created_at__lte=created_at__lte,
            created_at__range=created_at__range,
        )
        return self._list_oapg(
            query_params=args.query,
        )

