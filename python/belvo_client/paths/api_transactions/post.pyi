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

from belvo_client.model.transactions_retrieve500_response import TransactionsRetrieve500Response as TransactionsRetrieve500ResponseSchema
from belvo_client.model.transactions_retrieve408_response import TransactionsRetrieve408Response as TransactionsRetrieve408ResponseSchema
from belvo_client.model.transactions_retrieve401_response import TransactionsRetrieve401Response as TransactionsRetrieve401ResponseSchema
from belvo_client.model.transactions_retrieve428_response import TransactionsRetrieve428Response as TransactionsRetrieve428ResponseSchema
from belvo_client.model.transactions_retrieve400_response import TransactionsRetrieve400Response as TransactionsRetrieve400ResponseSchema
from belvo_client.model.transactions_retrieve201_response import TransactionsRetrieve201Response as TransactionsRetrieve201ResponseSchema
from belvo_client.model.asynchronous_accepted202 import AsynchronousAccepted202 as AsynchronousAccepted202Schema
from belvo_client.model.transactions_request import TransactionsRequest as TransactionsRequestSchema
from belvo_client.model.transactions_retrieve_response import TransactionsRetrieveResponse as TransactionsRetrieveResponseSchema

from belvo_client.type.transactions_retrieve408_response import TransactionsRetrieve408Response
from belvo_client.type.transactions_retrieve400_response import TransactionsRetrieve400Response
from belvo_client.type.transactions_request import TransactionsRequest
from belvo_client.type.transactions_retrieve201_response import TransactionsRetrieve201Response
from belvo_client.type.transactions_retrieve401_response import TransactionsRetrieve401Response
from belvo_client.type.asynchronous_accepted202 import AsynchronousAccepted202
from belvo_client.type.transactions_retrieve428_response import TransactionsRetrieve428Response
from belvo_client.type.transactions_retrieve500_response import TransactionsRetrieve500Response
from belvo_client.type.transactions_retrieve_response import TransactionsRetrieveResponse

# Query params
OmitSchema = schemas.StrSchema
FieldsSchema = schemas.StrSchema
RequestRequiredQueryParams = typing_extensions.TypedDict(
    'RequestRequiredQueryParams',
    {
    }
)
RequestOptionalQueryParams = typing_extensions.TypedDict(
    'RequestOptionalQueryParams',
    {
        'omit': typing.Union[OmitSchema, str, ],
        'fields': typing.Union[FieldsSchema, str, ],
    },
    total=False
)


class RequestQueryParams(RequestRequiredQueryParams, RequestOptionalQueryParams):
    pass


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
# Header params


class XBelvoRequestModeSchema(
    schemas.EnumBase,
    schemas.StrSchema
):
    
    @schemas.classproperty
    def ASYNC(cls):
        return cls("async")
RequestRequiredHeaderParams = typing_extensions.TypedDict(
    'RequestRequiredHeaderParams',
    {
    }
)
RequestOptionalHeaderParams = typing_extensions.TypedDict(
    'RequestOptionalHeaderParams',
    {
        'X-Belvo-Request-Mode': typing.Union[XBelvoRequestModeSchema, str, ],
    },
    total=False
)


class RequestHeaderParams(RequestRequiredHeaderParams, RequestOptionalHeaderParams):
    pass


request_header_x_belvo_request_mode = api_client.HeaderParameter(
    name="X-Belvo-Request-Mode",
    style=api_client.ParameterStyle.SIMPLE,
    schema=XBelvoRequestModeSchema,
)
# body param
SchemaForRequestBodyApplicationJson = TransactionsRequestSchema


request_body_transactions_request = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJson),
    },
    required=True,
)
SchemaFor200ResponseBodyApplicationJson = TransactionsRetrieveResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: TransactionsRetrieveResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: TransactionsRetrieveResponse


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
SchemaFor201ResponseBodyApplicationJson = TransactionsRetrieve201ResponseSchema


@dataclass
class ApiResponseFor201(api_client.ApiResponse):
    body: TransactionsRetrieve201Response


@dataclass
class ApiResponseFor201Async(api_client.AsyncApiResponse):
    body: TransactionsRetrieve201Response


_response_for_201 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor201,
    response_cls_async=ApiResponseFor201Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor201ResponseBodyApplicationJson),
    },
)
SchemaFor202ResponseBodyApplicationJson = AsynchronousAccepted202Schema


@dataclass
class ApiResponseFor202(api_client.ApiResponse):
    body: AsynchronousAccepted202


@dataclass
class ApiResponseFor202Async(api_client.AsyncApiResponse):
    body: AsynchronousAccepted202


_response_for_202 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor202,
    response_cls_async=ApiResponseFor202Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor202ResponseBodyApplicationJson),
    },
)
SchemaFor400ResponseBodyApplicationJson = TransactionsRetrieve400ResponseSchema


@dataclass
class ApiResponseFor400(api_client.ApiResponse):
    body: TransactionsRetrieve400Response


@dataclass
class ApiResponseFor400Async(api_client.AsyncApiResponse):
    body: TransactionsRetrieve400Response


_response_for_400 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor400,
    response_cls_async=ApiResponseFor400Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor400ResponseBodyApplicationJson),
    },
)
SchemaFor401ResponseBodyApplicationJson = TransactionsRetrieve401ResponseSchema


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    body: TransactionsRetrieve401Response


@dataclass
class ApiResponseFor401Async(api_client.AsyncApiResponse):
    body: TransactionsRetrieve401Response


_response_for_401 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor401,
    response_cls_async=ApiResponseFor401Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor401ResponseBodyApplicationJson),
    },
)
SchemaFor408ResponseBodyApplicationJson = TransactionsRetrieve408ResponseSchema


@dataclass
class ApiResponseFor408(api_client.ApiResponse):
    body: TransactionsRetrieve408Response


@dataclass
class ApiResponseFor408Async(api_client.AsyncApiResponse):
    body: TransactionsRetrieve408Response


_response_for_408 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor408,
    response_cls_async=ApiResponseFor408Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor408ResponseBodyApplicationJson),
    },
)
SchemaFor428ResponseBodyApplicationJson = TransactionsRetrieve428ResponseSchema


@dataclass
class ApiResponseFor428(api_client.ApiResponse):
    body: TransactionsRetrieve428Response


@dataclass
class ApiResponseFor428Async(api_client.AsyncApiResponse):
    body: TransactionsRetrieve428Response


_response_for_428 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor428,
    response_cls_async=ApiResponseFor428Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor428ResponseBodyApplicationJson),
    },
)
SchemaFor500ResponseBodyApplicationJson = TransactionsRetrieve500ResponseSchema


@dataclass
class ApiResponseFor500(api_client.ApiResponse):
    body: TransactionsRetrieve500Response


@dataclass
class ApiResponseFor500Async(api_client.AsyncApiResponse):
    body: TransactionsRetrieve500Response


_response_for_500 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor500,
    response_cls_async=ApiResponseFor500Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor500ResponseBodyApplicationJson),
    },
)
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _retrieve_mapped_args(
        self,
        link: str,
        date_from: str,
        date_to: str,
        account: typing.Optional[str] = None,
        token: typing.Optional[str] = None,
        save_data: typing.Optional[bool] = None,
        x_belvo_request_mode: typing.Optional[str] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _query_params = {}
        _header_params = {}
        _body = {}
        if link is not None:
            _body["link"] = link
        if account is not None:
            _body["account"] = account
        if date_from is not None:
            _body["date_from"] = date_from
        if date_to is not None:
            _body["date_to"] = date_to
        if token is not None:
            _body["token"] = token
        if save_data is not None:
            _body["save_data"] = save_data
        args.body = _body
        if omit is not None:
            _query_params["omit"] = omit
        if fields is not None:
            _query_params["fields"] = fields
        if x_belvo_request_mode is not None:
            _header_params["X-Belvo-Request-Mode"] = x_belvo_request_mode
        args.query = _query_params
        args.header = _header_params
        return args

    async def _aretrieve_oapg(
        self,
        body: typing.Any = None,
            query_params: typing.Optional[dict] = {},
            header_params: typing.Optional[dict] = {},
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200Async,
        ApiResponseFor201Async,
        ApiResponseFor202Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        Retrieve transactions for a link
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        self._verify_typed_dict_inputs_oapg(RequestHeaderParams, header_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_omit,
            request_query_fields,
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
        for parameter in (
            request_header_x_belvo_request_mode,
        ):
            parameter_data = header_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _headers.extend(serialized_data)
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        serialized_data = request_body_transactions_request.serialize(body, content_type)
        _headers.add('Content-Type', content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method='post'.upper(),
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
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

    def _retrieve_oapg(
        self,
        body: typing.Any = None,
            query_params: typing.Optional[dict] = {},
            header_params: typing.Optional[dict] = {},
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseFor201,
        ApiResponseFor202,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        Retrieve transactions for a link
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParams, query_params)
        self._verify_typed_dict_inputs_oapg(RequestHeaderParams, header_params)
        used_path = path.value
    
        prefix_separator_iterator = None
        for parameter in (
            request_query_omit,
            request_query_fields,
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
        for parameter in (
            request_header_x_belvo_request_mode,
        ):
            parameter_data = header_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _headers.extend(serialized_data)
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        serialized_data = request_body_transactions_request.serialize(body, content_type)
        _headers.add('Content-Type', content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']    
        response = self.api_client.call_api(
            resource_path=used_path,
            method='post'.upper(),
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
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

class Retrieve(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def aretrieve(
        self,
        link: str,
        date_from: str,
        date_to: str,
        account: typing.Optional[str] = None,
        token: typing.Optional[str] = None,
        save_data: typing.Optional[bool] = None,
        x_belvo_request_mode: typing.Optional[str] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        ApiResponseFor201Async,
        ApiResponseFor202Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._retrieve_mapped_args(
            link=link,
            date_from=date_from,
            date_to=date_to,
            account=account,
            token=token,
            save_data=save_data,
            x_belvo_request_mode=x_belvo_request_mode,
            omit=omit,
            fields=fields,
        )
        return await self._aretrieve_oapg(
            body=args.body,
            query_params=args.query,
            header_params=args.header,
        )
    
    def retrieve(
        self,
        link: str,
        date_from: str,
        date_to: str,
        account: typing.Optional[str] = None,
        token: typing.Optional[str] = None,
        save_data: typing.Optional[bool] = None,
        x_belvo_request_mode: typing.Optional[str] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseFor201,
        ApiResponseFor202,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._retrieve_mapped_args(
            link=link,
            date_from=date_from,
            date_to=date_to,
            account=account,
            token=token,
            save_data=save_data,
            x_belvo_request_mode=x_belvo_request_mode,
            omit=omit,
            fields=fields,
        )
        return self._retrieve_oapg(
            body=args.body,
            query_params=args.query,
            header_params=args.header,
        )

class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def apost(
        self,
        link: str,
        date_from: str,
        date_to: str,
        account: typing.Optional[str] = None,
        token: typing.Optional[str] = None,
        save_data: typing.Optional[bool] = None,
        x_belvo_request_mode: typing.Optional[str] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200Async,
        ApiResponseFor201Async,
        ApiResponseFor202Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._retrieve_mapped_args(
            link=link,
            date_from=date_from,
            date_to=date_to,
            account=account,
            token=token,
            save_data=save_data,
            x_belvo_request_mode=x_belvo_request_mode,
            omit=omit,
            fields=fields,
        )
        return await self._aretrieve_oapg(
            body=args.body,
            query_params=args.query,
            header_params=args.header,
        )
    
    def post(
        self,
        link: str,
        date_from: str,
        date_to: str,
        account: typing.Optional[str] = None,
        token: typing.Optional[str] = None,
        save_data: typing.Optional[bool] = None,
        x_belvo_request_mode: typing.Optional[str] = None,
        omit: typing.Optional[str] = None,
        fields: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        ApiResponseFor201,
        ApiResponseFor202,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._retrieve_mapped_args(
            link=link,
            date_from=date_from,
            date_to=date_to,
            account=account,
            token=token,
            save_data=save_data,
            x_belvo_request_mode=x_belvo_request_mode,
            omit=omit,
            fields=fields,
        )
        return self._retrieve_oapg(
            body=args.body,
            query_params=args.query,
            header_params=args.header,
        )

