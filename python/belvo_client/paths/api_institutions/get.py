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

from belvo_client.model.institutions_list_response import InstitutionsListResponse as InstitutionsListResponseSchema
from belvo_client.model.institutions_paginated_response import InstitutionsPaginatedResponse as InstitutionsPaginatedResponseSchema

from belvo_client.type.institutions_paginated_response import InstitutionsPaginatedResponse
from belvo_client.type.institutions_list_response import InstitutionsListResponse

from . import path

# Query params
PageSchema = schemas.Int32Schema


class PageSizeSchema(
    schemas.Int32Schema
):


    class MetaOapg:
        format = 'int32'
        inclusive_maximum = 1000
        inclusive_minimum = 1
OmitSchema = schemas.StrSchema
FieldsSchema = schemas.StrSchema
CountryCodeSchema = schemas.StrSchema
CountryCodeInSchema = schemas.StrSchema
DisplayNameSchema = schemas.StrSchema
NameSchema = schemas.StrSchema
NameInSchema = schemas.StrSchema
ResourcesAllinSchema = schemas.StrSchema
StatusSchema = schemas.StrSchema
StatusInSchema = schemas.StrSchema
TypeSchema = schemas.StrSchema
TypeInSchema = schemas.StrSchema
WebsiteSchema = schemas.StrSchema
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
        'country_code': typing.Union[CountryCodeSchema, str, ],
        'country_code__in': typing.Union[CountryCodeInSchema, str, ],
        'display_name': typing.Union[DisplayNameSchema, str, ],
        'name': typing.Union[NameSchema, str, ],
        'name__in': typing.Union[NameInSchema, str, ],
        'resources__allin': typing.Union[ResourcesAllinSchema, str, ],
        'status': typing.Union[StatusSchema, str, ],
        'status__in': typing.Union[StatusInSchema, str, ],
        'type': typing.Union[TypeSchema, str, ],
        'type__in': typing.Union[TypeInSchema, str, ],
        'website': typing.Union[WebsiteSchema, str, ],
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
request_query_country_code = api_client.QueryParameter(
    name="country_code",
    style=api_client.ParameterStyle.FORM,
    schema=CountryCodeSchema,
    explode=True,
)
request_query_country_code__in = api_client.QueryParameter(
    name="country_code__in",
    style=api_client.ParameterStyle.FORM,
    schema=CountryCodeInSchema,
    explode=True,
)
request_query_display_name = api_client.QueryParameter(
    name="display_name",
    style=api_client.ParameterStyle.FORM,
    schema=DisplayNameSchema,
    explode=True,
)
request_query_name = api_client.QueryParameter(
    name="name",
    style=api_client.ParameterStyle.FORM,
    schema=NameSchema,
    explode=True,
)
request_query_name__in = api_client.QueryParameter(
    name="name__in",
    style=api_client.ParameterStyle.FORM,
    schema=NameInSchema,
    explode=True,
)
request_query_resources__allin = api_client.QueryParameter(
    name="resources__allin",
    style=api_client.ParameterStyle.FORM,
    schema=ResourcesAllinSchema,
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
request_query_website = api_client.QueryParameter(
    name="website",
    style=api_client.ParameterStyle.FORM,
    schema=WebsiteSchema,
    explode=True,
)
_auth = [
    'basicAuth',
]
SchemaFor200ResponseBodyApplicationJson = InstitutionsPaginatedResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: InstitutionsPaginatedResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: InstitutionsPaginatedResponse


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
SchemaFor401ResponseBodyApplicationJson = InstitutionsListResponseSchema


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    body: InstitutionsListResponse


@dataclass
class ApiResponseFor401Async(api_client.AsyncApiResponse):
    body: InstitutionsListResponse


_response_for_401 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor401,
    response_cls_async=ApiResponseFor401Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor401ResponseBodyApplicationJson),
    },
)
_status_code_to_response = {
    '200': _response_for_200,
    '401': _response_for_401,
}
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _list_mapped_args(
        self,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        country_code: typing.Optional[str] = None,
        country_code__in: typing.Optional[str] = None,
        display_name: typing.Optional[str] = None,
        name: typing.Optional[str] = None,
        name__in: typing.Optional[str] = None,
        resources__allin: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        website: typing.Optional[str] = None,
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
        if country_code is not None:
            _query_params["country_code"] = country_code
        if country_code__in is not None:
            _query_params["country_code__in"] = country_code__in
        if display_name is not None:
            _query_params["display_name"] = display_name
        if name is not None:
            _query_params["name"] = name
        if name__in is not None:
            _query_params["name__in"] = name__in
        if resources__allin is not None:
            _query_params["resources__allin"] = resources__allin
        if status is not None:
            _query_params["status"] = status
        if status__in is not None:
            _query_params["status__in"] = status__in
        if type is not None:
            _query_params["type"] = type
        if type__in is not None:
            _query_params["type__in"] = type__in
        if website is not None:
            _query_params["website"] = website
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
        List all institutions
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
            request_query_country_code,
            request_query_country_code__in,
            request_query_display_name,
            request_query_name,
            request_query_name__in,
            request_query_resources__allin,
            request_query_status,
            request_query_status__in,
            request_query_type,
            request_query_type__in,
            request_query_website,
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
        List all institutions
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
            request_query_country_code,
            request_query_country_code__in,
            request_query_display_name,
            request_query_name,
            request_query_name__in,
            request_query_resources__allin,
            request_query_status,
            request_query_status__in,
            request_query_type,
            request_query_type__in,
            request_query_website,
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
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        country_code: typing.Optional[str] = None,
        country_code__in: typing.Optional[str] = None,
        display_name: typing.Optional[str] = None,
        name: typing.Optional[str] = None,
        name__in: typing.Optional[str] = None,
        resources__allin: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        website: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._list_mapped_args(
            page=page,
            page_size=page_size,
            omit=omit,
            fields=fields,
            country_code=country_code,
            country_code__in=country_code__in,
            display_name=display_name,
            name=name,
            name__in=name__in,
            resources__allin=resources__allin,
            status=status,
            status__in=status__in,
            type=type,
            type__in=type__in,
            website=website,
        )
        return await self._alist_oapg(
            query_params=args.query,
        )
    
    def list(
        self,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        country_code: typing.Optional[str] = None,
        country_code__in: typing.Optional[str] = None,
        display_name: typing.Optional[str] = None,
        name: typing.Optional[str] = None,
        name__in: typing.Optional[str] = None,
        resources__allin: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        website: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._list_mapped_args(
            page=page,
            page_size=page_size,
            omit=omit,
            fields=fields,
            country_code=country_code,
            country_code__in=country_code__in,
            display_name=display_name,
            name=name,
            name__in=name__in,
            resources__allin=resources__allin,
            status=status,
            status__in=status__in,
            type=type,
            type__in=type__in,
            website=website,
        )
        return self._list_oapg(
            query_params=args.query,
        )

class ApiForget(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aget(
        self,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        country_code: typing.Optional[str] = None,
        country_code__in: typing.Optional[str] = None,
        display_name: typing.Optional[str] = None,
        name: typing.Optional[str] = None,
        name__in: typing.Optional[str] = None,
        resources__allin: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        website: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._list_mapped_args(
            page=page,
            page_size=page_size,
            omit=omit,
            fields=fields,
            country_code=country_code,
            country_code__in=country_code__in,
            display_name=display_name,
            name=name,
            name__in=name__in,
            resources__allin=resources__allin,
            status=status,
            status__in=status__in,
            type=type,
            type__in=type__in,
            website=website,
        )
        return await self._alist_oapg(
            query_params=args.query,
        )
    
    def get(
        self,
        page: typing.Optional[int] = None,
        page_size: typing.Optional[int] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
        country_code: typing.Optional[str] = None,
        country_code__in: typing.Optional[str] = None,
        display_name: typing.Optional[str] = None,
        name: typing.Optional[str] = None,
        name__in: typing.Optional[str] = None,
        resources__allin: typing.Optional[str] = None,
        status: typing.Optional[str] = None,
        status__in: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        type__in: typing.Optional[str] = None,
        website: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._list_mapped_args(
            page=page,
            page_size=page_size,
            omit=omit,
            fields=fields,
            country_code=country_code,
            country_code__in=country_code__in,
            display_name=display_name,
            name=name,
            name__in=name__in,
            resources__allin=resources__allin,
            status=status,
            status__in=status__in,
            type=type,
            type__in=type__in,
            website=website,
        )
        return self._list_oapg(
            query_params=args.query,
        )

