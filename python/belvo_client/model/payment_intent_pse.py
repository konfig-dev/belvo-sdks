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


class PaymentIntentPse(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "amount",
            "failure_code",
            "payment_method_information",
            "payment_method_details",
            "created_at",
            "description",
            "failure_message",
            "created_by",
            "allowed_payment_method_types",
            "updated_at",
            "next_step",
            "provider",
            "selected_payment_method_type",
            "currency",
            "id",
            "last_error",
            "customer",
            "status",
        }
        
        class properties:
            description = schemas.StrSchema
            id = schemas.UUIDSchema
            created_at = schemas.DateTimeSchema
            created_by = schemas.UUIDSchema
            customer = schemas.UUIDSchema
            
            
            class allowed_payment_method_types(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['EnumPaymentLinkAllowedPaymentMethod']:
                        return EnumPaymentLinkAllowedPaymentMethod
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['EnumPaymentLinkAllowedPaymentMethod'], typing.List['EnumPaymentLinkAllowedPaymentMethod']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'allowed_payment_method_types':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'EnumPaymentLinkAllowedPaymentMethod':
                    return super().__getitem__(i)
            
            
            class amount(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    regex=[{
                        'pattern': r'^(?!0+$)\d{1,12}$',
                    }]
        
            @staticmethod
            def currency() -> typing.Type['EnumPaymentsCurrency']:
                return EnumPaymentsCurrency
            
            
            class failure_code(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'failure_code':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class failure_message(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'failure_message':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class next_step(
                schemas.ComposedSchema,
            ):
            
            
                class MetaOapg:
                    
                    @classmethod
                    @functools.lru_cache()
                    def one_of(cls):
                        # we need this here to make our import statements work
                        # we must store _composed_schemas in here so the code is only run
                        # when we invoke this method. If we kept this at the class
                        # level we would get an error because the class level
                        # code would be run when this module is imported, and these composed
                        # classes don't exist yet because their module has not finished
                        # loading
                        return [
                            NextStepDisplayPaymentMethodInformationPse,
                            NextStepDisplayCredentialsRequiredPse,
                            NextStepDisplayNeedsRedirectPse,
                            NextStepDisplayTokenRequiredPse,
                            NextStepDisplayCustomerBankAccountsPse,
                            NextStepDisplayConfirmationRequiredPse,
                        ]
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'next_step':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class last_error(
                schemas.ComposedSchema,
            ):
            
            
                class MetaOapg:
                    
                    @classmethod
                    @functools.lru_cache()
                    def one_of(cls):
                        # we need this here to make our import statements work
                        # we must store _composed_schemas in here so the code is only run
                        # when we invoke this method. If we kept this at the class
                        # level we would get an error because the class level
                        # code would be run when this module is imported, and these composed
                        # classes don't exist yet because their module has not finished
                        # loading
                        return [
                            LastErrorInvalidCredentials,
                            LastErrorInvalidToken,
                            LastErrorLoginError,
                            LastErrorTwoFactor,
                            LastErrorPaymentError,
                            LastErrorSessionExpired,
                        ]
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'last_error':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
        
            @staticmethod
            def payment_method_details() -> typing.Type['PaymentIntentPaymentMethodDetailsPse']:
                return PaymentIntentPaymentMethodDetailsPse
        
            @staticmethod
            def payment_method_information() -> typing.Type['PaymentMethodInformationPse']:
                return PaymentMethodInformationPse
        
            @staticmethod
            def provider() -> typing.Type['EnumPaymentLinkProvider']:
                return EnumPaymentLinkProvider
        
            @staticmethod
            def selected_payment_method_type() -> typing.Type['EnumPaymentLinkAllowedPaymentMethod']:
                return EnumPaymentLinkAllowedPaymentMethod
        
            @staticmethod
            def status() -> typing.Type['EnumPaymentIntentStatus']:
                return EnumPaymentIntentStatus
            
            
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
            metadata = schemas.DictSchema
            
            
            class charges(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['Charge']:
                        return Charge
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['Charge'], typing.List['Charge']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'charges':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'Charge':
                    return super().__getitem__(i)
            __annotations__ = {
                "description": description,
                "id": id,
                "created_at": created_at,
                "created_by": created_by,
                "customer": customer,
                "allowed_payment_method_types": allowed_payment_method_types,
                "amount": amount,
                "currency": currency,
                "failure_code": failure_code,
                "failure_message": failure_message,
                "next_step": next_step,
                "last_error": last_error,
                "payment_method_details": payment_method_details,
                "payment_method_information": payment_method_information,
                "provider": provider,
                "selected_payment_method_type": selected_payment_method_type,
                "status": status,
                "updated_at": updated_at,
                "metadata": metadata,
                "charges": charges,
            }
    
    amount: MetaOapg.properties.amount
    failure_code: MetaOapg.properties.failure_code
    payment_method_information: 'PaymentMethodInformationPse'
    payment_method_details: 'PaymentIntentPaymentMethodDetailsPse'
    created_at: MetaOapg.properties.created_at
    description: MetaOapg.properties.description
    failure_message: MetaOapg.properties.failure_message
    created_by: MetaOapg.properties.created_by
    allowed_payment_method_types: MetaOapg.properties.allowed_payment_method_types
    updated_at: MetaOapg.properties.updated_at
    next_step: MetaOapg.properties.next_step
    provider: 'EnumPaymentLinkProvider'
    selected_payment_method_type: 'EnumPaymentLinkAllowedPaymentMethod'
    currency: 'EnumPaymentsCurrency'
    id: MetaOapg.properties.id
    last_error: MetaOapg.properties.last_error
    customer: MetaOapg.properties.customer
    status: 'EnumPaymentIntentStatus'
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_by"]) -> MetaOapg.properties.created_by: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["customer"]) -> MetaOapg.properties.customer: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["allowed_payment_method_types"]) -> MetaOapg.properties.allowed_payment_method_types: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["amount"]) -> MetaOapg.properties.amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> 'EnumPaymentsCurrency': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["failure_code"]) -> MetaOapg.properties.failure_code: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["failure_message"]) -> MetaOapg.properties.failure_message: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["next_step"]) -> MetaOapg.properties.next_step: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_error"]) -> MetaOapg.properties.last_error: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_method_details"]) -> 'PaymentIntentPaymentMethodDetailsPse': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_method_information"]) -> 'PaymentMethodInformationPse': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["provider"]) -> 'EnumPaymentLinkProvider': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["selected_payment_method_type"]) -> 'EnumPaymentLinkAllowedPaymentMethod': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> 'EnumPaymentIntentStatus': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["updated_at"]) -> MetaOapg.properties.updated_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["metadata"]) -> MetaOapg.properties.metadata: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["charges"]) -> MetaOapg.properties.charges: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["description", "id", "created_at", "created_by", "customer", "allowed_payment_method_types", "amount", "currency", "failure_code", "failure_message", "next_step", "last_error", "payment_method_details", "payment_method_information", "provider", "selected_payment_method_type", "status", "updated_at", "metadata", "charges", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_by"]) -> MetaOapg.properties.created_by: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["customer"]) -> MetaOapg.properties.customer: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["allowed_payment_method_types"]) -> MetaOapg.properties.allowed_payment_method_types: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["amount"]) -> MetaOapg.properties.amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> 'EnumPaymentsCurrency': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["failure_code"]) -> MetaOapg.properties.failure_code: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["failure_message"]) -> MetaOapg.properties.failure_message: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["next_step"]) -> MetaOapg.properties.next_step: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_error"]) -> MetaOapg.properties.last_error: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_method_details"]) -> 'PaymentIntentPaymentMethodDetailsPse': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_method_information"]) -> 'PaymentMethodInformationPse': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["provider"]) -> 'EnumPaymentLinkProvider': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["selected_payment_method_type"]) -> 'EnumPaymentLinkAllowedPaymentMethod': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> 'EnumPaymentIntentStatus': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["updated_at"]) -> MetaOapg.properties.updated_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["metadata"]) -> typing.Union[MetaOapg.properties.metadata, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["charges"]) -> typing.Union[MetaOapg.properties.charges, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["description", "id", "created_at", "created_by", "customer", "allowed_payment_method_types", "amount", "currency", "failure_code", "failure_message", "next_step", "last_error", "payment_method_details", "payment_method_information", "provider", "selected_payment_method_type", "status", "updated_at", "metadata", "charges", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        amount: typing.Union[MetaOapg.properties.amount, str, ],
        failure_code: typing.Union[MetaOapg.properties.failure_code, None, str, ],
        payment_method_information: 'PaymentMethodInformationPse',
        payment_method_details: 'PaymentIntentPaymentMethodDetailsPse',
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, ],
        description: typing.Union[MetaOapg.properties.description, str, ],
        failure_message: typing.Union[MetaOapg.properties.failure_message, None, str, ],
        created_by: typing.Union[MetaOapg.properties.created_by, str, uuid.UUID, ],
        allowed_payment_method_types: typing.Union[MetaOapg.properties.allowed_payment_method_types, list, tuple, ],
        updated_at: typing.Union[MetaOapg.properties.updated_at, None, str, datetime, ],
        next_step: typing.Union[MetaOapg.properties.next_step, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        provider: 'EnumPaymentLinkProvider',
        selected_payment_method_type: 'EnumPaymentLinkAllowedPaymentMethod',
        currency: 'EnumPaymentsCurrency',
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, ],
        last_error: typing.Union[MetaOapg.properties.last_error, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        customer: typing.Union[MetaOapg.properties.customer, str, uuid.UUID, ],
        status: 'EnumPaymentIntentStatus',
        metadata: typing.Union[MetaOapg.properties.metadata, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        charges: typing.Union[MetaOapg.properties.charges, list, tuple, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'PaymentIntentPse':
        return super().__new__(
            cls,
            *args,
            amount=amount,
            failure_code=failure_code,
            payment_method_information=payment_method_information,
            payment_method_details=payment_method_details,
            created_at=created_at,
            description=description,
            failure_message=failure_message,
            created_by=created_by,
            allowed_payment_method_types=allowed_payment_method_types,
            updated_at=updated_at,
            next_step=next_step,
            provider=provider,
            selected_payment_method_type=selected_payment_method_type,
            currency=currency,
            id=id,
            last_error=last_error,
            customer=customer,
            status=status,
            metadata=metadata,
            charges=charges,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.charge import Charge
from belvo_client.model.enum_payment_intent_status import EnumPaymentIntentStatus
from belvo_client.model.enum_payment_link_allowed_payment_method import EnumPaymentLinkAllowedPaymentMethod
from belvo_client.model.enum_payment_link_provider import EnumPaymentLinkProvider
from belvo_client.model.enum_payments_currency import EnumPaymentsCurrency
from belvo_client.model.last_error_invalid_credentials import LastErrorInvalidCredentials
from belvo_client.model.last_error_invalid_token import LastErrorInvalidToken
from belvo_client.model.last_error_login_error import LastErrorLoginError
from belvo_client.model.last_error_payment_error import LastErrorPaymentError
from belvo_client.model.last_error_session_expired import LastErrorSessionExpired
from belvo_client.model.last_error_two_factor import LastErrorTwoFactor
from belvo_client.model.next_step_display_confirmation_required_pse import NextStepDisplayConfirmationRequiredPse
from belvo_client.model.next_step_display_credentials_required_pse import NextStepDisplayCredentialsRequiredPse
from belvo_client.model.next_step_display_customer_bank_accounts_pse import NextStepDisplayCustomerBankAccountsPse
from belvo_client.model.next_step_display_needs_redirect_pse import NextStepDisplayNeedsRedirectPse
from belvo_client.model.next_step_display_payment_method_information_pse import NextStepDisplayPaymentMethodInformationPse
from belvo_client.model.next_step_display_token_required_pse import NextStepDisplayTokenRequiredPse
from belvo_client.model.payment_intent_payment_method_details_pse import PaymentIntentPaymentMethodDetailsPse
from belvo_client.model.payment_method_information_pse import PaymentMethodInformationPse
