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


class LinksRequest(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "institution",
            "username",
        }
        
        class properties:
            
            
            class institution(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    regex=[{
                        'pattern': r'[a-z]+_[a-z]{2}_[a-z]+',
                    }]
            username = schemas.StrSchema
            password = schemas.StrSchema
            
            
            class external_id(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    min_length = 3
            username2 = schemas.StrSchema
            username3 = schemas.StrSchema
            password2 = schemas.StrSchema
            token = schemas.StrSchema
        
            @staticmethod
            def access_mode() -> typing.Type['EnumLinkAccessModeRequest']:
                return EnumLinkAccessModeRequest
            fetch_historical = schemas.BoolSchema
            credentials_storage = schemas.StrSchema
            username_type = schemas.StrSchema
            certificate = schemas.StrSchema
            private_key = schemas.StrSchema
            __annotations__ = {
                "institution": institution,
                "username": username,
                "password": password,
                "external_id": external_id,
                "username2": username2,
                "username3": username3,
                "password2": password2,
                "token": token,
                "access_mode": access_mode,
                "fetch_historical": fetch_historical,
                "credentials_storage": credentials_storage,
                "username_type": username_type,
                "certificate": certificate,
                "private_key": private_key,
            }
    
    institution: MetaOapg.properties.institution
    username: MetaOapg.properties.username
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["institution"]) -> MetaOapg.properties.institution: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username"]) -> MetaOapg.properties.username: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> MetaOapg.properties.password: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["external_id"]) -> MetaOapg.properties.external_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username2"]) -> MetaOapg.properties.username2: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username3"]) -> MetaOapg.properties.username3: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password2"]) -> MetaOapg.properties.password2: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["token"]) -> MetaOapg.properties.token: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["access_mode"]) -> 'EnumLinkAccessModeRequest': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["fetch_historical"]) -> MetaOapg.properties.fetch_historical: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["credentials_storage"]) -> MetaOapg.properties.credentials_storage: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["username_type"]) -> MetaOapg.properties.username_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["certificate"]) -> MetaOapg.properties.certificate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["private_key"]) -> MetaOapg.properties.private_key: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["institution", "username", "password", "external_id", "username2", "username3", "password2", "token", "access_mode", "fetch_historical", "credentials_storage", "username_type", "certificate", "private_key", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["institution"]) -> MetaOapg.properties.institution: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["username"]) -> MetaOapg.properties.username: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["password"]) -> typing.Union[MetaOapg.properties.password, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["external_id"]) -> typing.Union[MetaOapg.properties.external_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["username2"]) -> typing.Union[MetaOapg.properties.username2, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["username3"]) -> typing.Union[MetaOapg.properties.username3, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["password2"]) -> typing.Union[MetaOapg.properties.password2, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["token"]) -> typing.Union[MetaOapg.properties.token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["access_mode"]) -> typing.Union['EnumLinkAccessModeRequest', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["fetch_historical"]) -> typing.Union[MetaOapg.properties.fetch_historical, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["credentials_storage"]) -> typing.Union[MetaOapg.properties.credentials_storage, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["username_type"]) -> typing.Union[MetaOapg.properties.username_type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["certificate"]) -> typing.Union[MetaOapg.properties.certificate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["private_key"]) -> typing.Union[MetaOapg.properties.private_key, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["institution", "username", "password", "external_id", "username2", "username3", "password2", "token", "access_mode", "fetch_historical", "credentials_storage", "username_type", "certificate", "private_key", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        institution: typing.Union[MetaOapg.properties.institution, str, ],
        username: typing.Union[MetaOapg.properties.username, str, ],
        password: typing.Union[MetaOapg.properties.password, str, schemas.Unset] = schemas.unset,
        external_id: typing.Union[MetaOapg.properties.external_id, str, schemas.Unset] = schemas.unset,
        username2: typing.Union[MetaOapg.properties.username2, str, schemas.Unset] = schemas.unset,
        username3: typing.Union[MetaOapg.properties.username3, str, schemas.Unset] = schemas.unset,
        password2: typing.Union[MetaOapg.properties.password2, str, schemas.Unset] = schemas.unset,
        token: typing.Union[MetaOapg.properties.token, str, schemas.Unset] = schemas.unset,
        access_mode: typing.Union['EnumLinkAccessModeRequest', schemas.Unset] = schemas.unset,
        fetch_historical: typing.Union[MetaOapg.properties.fetch_historical, bool, schemas.Unset] = schemas.unset,
        credentials_storage: typing.Union[MetaOapg.properties.credentials_storage, str, schemas.Unset] = schemas.unset,
        username_type: typing.Union[MetaOapg.properties.username_type, str, schemas.Unset] = schemas.unset,
        certificate: typing.Union[MetaOapg.properties.certificate, str, schemas.Unset] = schemas.unset,
        private_key: typing.Union[MetaOapg.properties.private_key, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'LinksRequest':
        return super().__new__(
            cls,
            *args,
            institution=institution,
            username=username,
            password=password,
            external_id=external_id,
            username2=username2,
            username3=username3,
            password2=password2,
            token=token,
            access_mode=access_mode,
            fetch_historical=fetch_historical,
            credentials_storage=credentials_storage,
            username_type=username_type,
            certificate=certificate,
            private_key=private_key,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.enum_link_access_mode_request import EnumLinkAccessModeRequest
