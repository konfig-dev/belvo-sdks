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


class PaymentLinkPse(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "payment_url",
            "expires_at",
            "callback_urls",
            "created_at",
            "id",
            "created_by",
            "expires_in",
            "status",
        }
        
        class properties:
            id = schemas.UUIDSchema
            created_at = schemas.DateTimeSchema
            created_by = schemas.UUIDSchema
            payment_url = schemas.StrSchema
        
            @staticmethod
            def callback_urls() -> typing.Type['PaymentLinkCallbackUrlsResponse']:
                return PaymentLinkCallbackUrlsResponse
        
            @staticmethod
            def status() -> typing.Type['EnumPaymentLinksStatus']:
                return EnumPaymentLinksStatus
            
            
            class expires_in(
                schemas.StrSchema
            ):
                pass
            expires_at = schemas.DateTimeSchema
            access_token = schemas.StrSchema
        
            @staticmethod
            def payment_intent() -> typing.Type['PaymentIntentPse']:
                return PaymentIntentPse
            
            
            class updated_at(
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
                ) -> 'updated_at':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "id": id,
                "created_at": created_at,
                "created_by": created_by,
                "payment_url": payment_url,
                "callback_urls": callback_urls,
                "status": status,
                "expires_in": expires_in,
                "expires_at": expires_at,
                "access_token": access_token,
                "payment_intent": payment_intent,
                "updated_at": updated_at,
            }
    
    payment_url: MetaOapg.properties.payment_url
    expires_at: MetaOapg.properties.expires_at
    callback_urls: 'PaymentLinkCallbackUrlsResponse'
    created_at: MetaOapg.properties.created_at
    id: MetaOapg.properties.id
    created_by: MetaOapg.properties.created_by
    expires_in: MetaOapg.properties.expires_in
    status: 'EnumPaymentLinksStatus'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_by"]) -> MetaOapg.properties.created_by: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_url"]) -> MetaOapg.properties.payment_url: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["callback_urls"]) -> 'PaymentLinkCallbackUrlsResponse': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> 'EnumPaymentLinksStatus': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["expires_in"]) -> MetaOapg.properties.expires_in: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["expires_at"]) -> MetaOapg.properties.expires_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["access_token"]) -> MetaOapg.properties.access_token: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_intent"]) -> 'PaymentIntentPse': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["updated_at"]) -> MetaOapg.properties.updated_at: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "created_at", "created_by", "payment_url", "callback_urls", "status", "expires_in", "expires_at", "access_token", "payment_intent", "updated_at", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_by"]) -> MetaOapg.properties.created_by: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_url"]) -> MetaOapg.properties.payment_url: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["callback_urls"]) -> 'PaymentLinkCallbackUrlsResponse': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> 'EnumPaymentLinksStatus': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["expires_in"]) -> MetaOapg.properties.expires_in: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["expires_at"]) -> MetaOapg.properties.expires_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["access_token"]) -> typing.Union[MetaOapg.properties.access_token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_intent"]) -> typing.Union['PaymentIntentPse', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["updated_at"]) -> typing.Union[MetaOapg.properties.updated_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "created_at", "created_by", "payment_url", "callback_urls", "status", "expires_in", "expires_at", "access_token", "payment_intent", "updated_at", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        payment_url: typing.Union[MetaOapg.properties.payment_url, str, ],
        expires_at: typing.Union[MetaOapg.properties.expires_at, str, datetime, ],
        callback_urls: 'PaymentLinkCallbackUrlsResponse',
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, ],
        created_by: typing.Union[MetaOapg.properties.created_by, str, uuid.UUID, ],
        expires_in: typing.Union[MetaOapg.properties.expires_in, str, ],
        status: 'EnumPaymentLinksStatus',
        access_token: typing.Union[MetaOapg.properties.access_token, str, schemas.Unset] = schemas.unset,
        payment_intent: typing.Union['PaymentIntentPse', schemas.Unset] = schemas.unset,
        updated_at: typing.Union[MetaOapg.properties.updated_at, None, str, datetime, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'PaymentLinkPse':
        return super().__new__(
            cls,
            *args,
            payment_url=payment_url,
            expires_at=expires_at,
            callback_urls=callback_urls,
            created_at=created_at,
            id=id,
            created_by=created_by,
            expires_in=expires_in,
            status=status,
            access_token=access_token,
            payment_intent=payment_intent,
            updated_at=updated_at,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_payment_links_status import EnumPaymentLinksStatus
from belvo_client.model.payment_intent_pse import PaymentIntentPse
from belvo_client.model.payment_link_callback_urls_response import PaymentLinkCallbackUrlsResponse
