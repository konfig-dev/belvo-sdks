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

from belvo_client.model.payment_intents_create400_response import PaymentIntentsCreate400Response as PaymentIntentsCreate400ResponseSchema
from belvo_client.model.payment_intents_create_response import PaymentIntentsCreateResponse as PaymentIntentsCreateResponseSchema
from belvo_client.model.payment_intents_payment_method_details_pse import PaymentIntentsPaymentMethodDetailsPse as PaymentIntentsPaymentMethodDetailsPseSchema
from belvo_client.model.enum_payment_link_allowed_payment_method import EnumPaymentLinkAllowedPaymentMethod as EnumPaymentLinkAllowedPaymentMethodSchema
from belvo_client.model.payment_intents_create401_response import PaymentIntentsCreate401Response as PaymentIntentsCreate401ResponseSchema
from belvo_client.model.payment_intents_create_request import PaymentIntentsCreateRequest as PaymentIntentsCreateRequestSchema
from belvo_client.model.enum_payment_link_provider import EnumPaymentLinkProvider as EnumPaymentLinkProviderSchema
from belvo_client.model.payment_intents_create500_response import PaymentIntentsCreate500Response as PaymentIntentsCreate500ResponseSchema
from belvo_client.model.payment_intents_create408_response import PaymentIntentsCreate408Response as PaymentIntentsCreate408ResponseSchema

from belvo_client.type.enum_payment_link_provider import EnumPaymentLinkProvider
from belvo_client.type.payment_intents_create_response import PaymentIntentsCreateResponse
from belvo_client.type.payment_intents_create_request import PaymentIntentsCreateRequest
from belvo_client.type.payment_intents_payment_method_details_pse import PaymentIntentsPaymentMethodDetailsPse
from belvo_client.type.payment_intents_create500_response import PaymentIntentsCreate500Response
from belvo_client.type.enum_payment_link_allowed_payment_method import EnumPaymentLinkAllowedPaymentMethod
from belvo_client.type.payment_intents_create408_response import PaymentIntentsCreate408Response
from belvo_client.type.payment_intents_create400_response import PaymentIntentsCreate400Response
from belvo_client.type.payment_intents_create401_response import PaymentIntentsCreate401Response

# body param
SchemaForRequestBodyApplicationJson = PaymentIntentsCreateRequestSchema


request_body_payment_intents_create_request = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJson),
    },
)
SchemaFor201ResponseBodyApplicationJson = PaymentIntentsCreateResponseSchema


@dataclass
class ApiResponseFor201(api_client.ApiResponse):
    body: PaymentIntentsCreateResponse


@dataclass
class ApiResponseFor201Async(api_client.AsyncApiResponse):
    body: PaymentIntentsCreateResponse


_response_for_201 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor201,
    response_cls_async=ApiResponseFor201Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor201ResponseBodyApplicationJson),
    },
)
SchemaFor400ResponseBodyApplicationJson = PaymentIntentsCreate400ResponseSchema


@dataclass
class ApiResponseFor400(api_client.ApiResponse):
    body: PaymentIntentsCreate400Response


@dataclass
class ApiResponseFor400Async(api_client.AsyncApiResponse):
    body: PaymentIntentsCreate400Response


_response_for_400 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor400,
    response_cls_async=ApiResponseFor400Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor400ResponseBodyApplicationJson),
    },
)
SchemaFor401ResponseBodyApplicationJson = PaymentIntentsCreate401ResponseSchema


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    body: PaymentIntentsCreate401Response


@dataclass
class ApiResponseFor401Async(api_client.AsyncApiResponse):
    body: PaymentIntentsCreate401Response


_response_for_401 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor401,
    response_cls_async=ApiResponseFor401Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor401ResponseBodyApplicationJson),
    },
)
SchemaFor408ResponseBodyApplicationJson = PaymentIntentsCreate408ResponseSchema


@dataclass
class ApiResponseFor408(api_client.ApiResponse):
    body: PaymentIntentsCreate408Response


@dataclass
class ApiResponseFor408Async(api_client.AsyncApiResponse):
    body: PaymentIntentsCreate408Response


_response_for_408 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor408,
    response_cls_async=ApiResponseFor408Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor408ResponseBodyApplicationJson),
    },
)
SchemaFor500ResponseBodyApplicationJson = PaymentIntentsCreate500ResponseSchema


@dataclass
class ApiResponseFor500(api_client.ApiResponse):
    body: PaymentIntentsCreate500Response


@dataclass
class ApiResponseFor500Async(api_client.AsyncApiResponse):
    body: PaymentIntentsCreate500Response


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

    def _create_mapped_args(
        self,
        description: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        customer: typing.Optional[str] = None,
        allowed_payment_method_types: typing.Optional[typing.List[EnumPaymentLinkAllowedPaymentMethod]] = None,
        payment_method_details: typing.Optional[PaymentIntentsPaymentMethodDetailsPse] = None,
        provider: typing.Optional[EnumPaymentLinkProvider] = None,
        metadata: typing.Optional[typing.Dict[str, typing.Union[bool, date, datetime, dict, float, int, list, str, None]]] = None,
        body: typing.Optional[PaymentIntentsCreateRequest] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _body = {}
        if description is not None:
            _body["description"] = description
        if amount is not None:
            _body["amount"] = amount
        if customer is not None:
            _body["customer"] = customer
        if allowed_payment_method_types is not None:
            _body["allowed_payment_method_types"] = allowed_payment_method_types
        if payment_method_details is not None:
            _body["payment_method_details"] = payment_method_details
        if provider is not None:
            _body["provider"] = provider
        if metadata is not None:
            _body["metadata"] = metadata
        args.body = body if body is not None else _body
        return args

    async def _acreate_oapg(
        self,
        body: typing.Any = None,
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor201Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        Create a new payment intent
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
    
        _fields = None
        _body = None
        if body is not schemas.unset:
            serialized_data = request_body_payment_intents_create_request.serialize(body, content_type)
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

    def _create_oapg(
        self,
        body: typing.Any = None,
        skip_deserialization: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor201,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        Create a new payment intent
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
    
        _fields = None
        _body = None
        if body is not schemas.unset:
            serialized_data = request_body_payment_intents_create_request.serialize(body, content_type)
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

class Create(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def acreate(
        self,
        description: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        customer: typing.Optional[str] = None,
        allowed_payment_method_types: typing.Optional[typing.List[EnumPaymentLinkAllowedPaymentMethod]] = None,
        payment_method_details: typing.Optional[PaymentIntentsPaymentMethodDetailsPse] = None,
        provider: typing.Optional[EnumPaymentLinkProvider] = None,
        metadata: typing.Optional[typing.Dict[str, typing.Union[bool, date, datetime, dict, float, int, list, str, None]]] = None,
        body: typing.Optional[PaymentIntentsCreateRequest] = None,
    ) -> typing.Union[
        ApiResponseFor201Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._create_mapped_args(
            body=body,
            description=description,
            amount=amount,
            customer=customer,
            allowed_payment_method_types=allowed_payment_method_types,
            payment_method_details=payment_method_details,
            provider=provider,
            metadata=metadata,
        )
        return await self._acreate_oapg(
            body=args.body,
        )
    
    def create(
        self,
        description: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        customer: typing.Optional[str] = None,
        allowed_payment_method_types: typing.Optional[typing.List[EnumPaymentLinkAllowedPaymentMethod]] = None,
        payment_method_details: typing.Optional[PaymentIntentsPaymentMethodDetailsPse] = None,
        provider: typing.Optional[EnumPaymentLinkProvider] = None,
        metadata: typing.Optional[typing.Dict[str, typing.Union[bool, date, datetime, dict, float, int, list, str, None]]] = None,
        body: typing.Optional[PaymentIntentsCreateRequest] = None,
    ) -> typing.Union[
        ApiResponseFor201,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._create_mapped_args(
            body=body,
            description=description,
            amount=amount,
            customer=customer,
            allowed_payment_method_types=allowed_payment_method_types,
            payment_method_details=payment_method_details,
            provider=provider,
            metadata=metadata,
        )
        return self._create_oapg(
            body=args.body,
        )

class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def apost(
        self,
        description: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        customer: typing.Optional[str] = None,
        allowed_payment_method_types: typing.Optional[typing.List[EnumPaymentLinkAllowedPaymentMethod]] = None,
        payment_method_details: typing.Optional[PaymentIntentsPaymentMethodDetailsPse] = None,
        provider: typing.Optional[EnumPaymentLinkProvider] = None,
        metadata: typing.Optional[typing.Dict[str, typing.Union[bool, date, datetime, dict, float, int, list, str, None]]] = None,
        body: typing.Optional[PaymentIntentsCreateRequest] = None,
    ) -> typing.Union[
        ApiResponseFor201Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._create_mapped_args(
            body=body,
            description=description,
            amount=amount,
            customer=customer,
            allowed_payment_method_types=allowed_payment_method_types,
            payment_method_details=payment_method_details,
            provider=provider,
            metadata=metadata,
        )
        return await self._acreate_oapg(
            body=args.body,
        )
    
    def post(
        self,
        description: typing.Optional[str] = None,
        amount: typing.Optional[str] = None,
        customer: typing.Optional[str] = None,
        allowed_payment_method_types: typing.Optional[typing.List[EnumPaymentLinkAllowedPaymentMethod]] = None,
        payment_method_details: typing.Optional[PaymentIntentsPaymentMethodDetailsPse] = None,
        provider: typing.Optional[EnumPaymentLinkProvider] = None,
        metadata: typing.Optional[typing.Dict[str, typing.Union[bool, date, datetime, dict, float, int, list, str, None]]] = None,
        body: typing.Optional[PaymentIntentsCreateRequest] = None,
    ) -> typing.Union[
        ApiResponseFor201,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        args = self._create_mapped_args(
            body=body,
            description=description,
            amount=amount,
            customer=customer,
            allowed_payment_method_types=allowed_payment_method_types,
            payment_method_details=payment_method_details,
            provider=provider,
            metadata=metadata,
        )
        return self._create_oapg(
            body=args.body,
        )

