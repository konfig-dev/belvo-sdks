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


class Charge(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        required = {
            "amount",
            "failure_code",
            "metadata",
            "beneficiary",
            "updated_at",
            "provider",
            "payment_method_information",
            "payment_method_details",
            "created_at",
            "failure_message",
            "id",
            "status",
        }
        
        class properties:
            id = schemas.UUIDSchema
            created_at = schemas.DateTimeSchema
            
            
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
            
            
            class status(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "PENDING": "PENDING",
                        "SUCCEEDED": "SUCCEEDED",
                        "FAILED": "FAILED",
                    }
                
                @schemas.classproperty
                def PENDING(cls):
                    return cls("PENDING")
                
                @schemas.classproperty
                def SUCCEEDED(cls):
                    return cls("SUCCEEDED")
                
                @schemas.classproperty
                def FAILED(cls):
                    return cls("FAILED")
            
            
            class amount(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            metadata = schemas.DictSchema
            beneficiary = schemas.UUIDSchema
        
            @staticmethod
            def provider() -> typing.Type['EnumPaymentLinkProvider']:
                return EnumPaymentLinkProvider
            
            
            class payment_method_details(
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
                            ChargePaymentMethodDetailsPse,
                            ChargePaymentMethodDetailsOfpi,
                        ]
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'payment_method_details':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class payment_method_information(
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
                            PaymentMethodInformationPse,
                        ]
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'payment_method_information':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
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
            description = schemas.StrSchema
            created_by = schemas.UUIDSchema
            customer = schemas.UUIDSchema
        
            @staticmethod
            def currency() -> typing.Type['EnumPaymentsCurrency']:
                return EnumPaymentsCurrency
        
            @staticmethod
            def payment_method_type() -> typing.Type['EnumPaymentLinkAllowedPaymentMethod']:
                return EnumPaymentLinkAllowedPaymentMethod
            payment_intent = schemas.UUIDSchema
            
            
            class transactions(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['PaymentTransaction']:
                        return PaymentTransaction
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['PaymentTransaction'], typing.List['PaymentTransaction']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'transactions':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'PaymentTransaction':
                    return super().__getitem__(i)
            __annotations__ = {
                "id": id,
                "created_at": created_at,
                "failure_code": failure_code,
                "failure_message": failure_message,
                "status": status,
                "amount": amount,
                "metadata": metadata,
                "beneficiary": beneficiary,
                "provider": provider,
                "payment_method_details": payment_method_details,
                "payment_method_information": payment_method_information,
                "updated_at": updated_at,
                "description": description,
                "created_by": created_by,
                "customer": customer,
                "currency": currency,
                "payment_method_type": payment_method_type,
                "payment_intent": payment_intent,
                "transactions": transactions,
            }
    
    amount: MetaOapg.properties.amount
    failure_code: MetaOapg.properties.failure_code
    metadata: MetaOapg.properties.metadata
    beneficiary: MetaOapg.properties.beneficiary
    updated_at: MetaOapg.properties.updated_at
    provider: 'EnumPaymentLinkProvider'
    payment_method_information: MetaOapg.properties.payment_method_information
    payment_method_details: MetaOapg.properties.payment_method_details
    created_at: MetaOapg.properties.created_at
    failure_message: MetaOapg.properties.failure_message
    id: MetaOapg.properties.id
    status: MetaOapg.properties.status
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["failure_code"]) -> MetaOapg.properties.failure_code: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["failure_message"]) -> MetaOapg.properties.failure_message: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["amount"]) -> MetaOapg.properties.amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["metadata"]) -> MetaOapg.properties.metadata: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["beneficiary"]) -> MetaOapg.properties.beneficiary: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["provider"]) -> 'EnumPaymentLinkProvider': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_method_details"]) -> MetaOapg.properties.payment_method_details: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_method_information"]) -> MetaOapg.properties.payment_method_information: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["updated_at"]) -> MetaOapg.properties.updated_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_by"]) -> MetaOapg.properties.created_by: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["customer"]) -> MetaOapg.properties.customer: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> 'EnumPaymentsCurrency': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_method_type"]) -> 'EnumPaymentLinkAllowedPaymentMethod': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["payment_intent"]) -> MetaOapg.properties.payment_intent: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["transactions"]) -> MetaOapg.properties.transactions: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "created_at", "failure_code", "failure_message", "status", "amount", "metadata", "beneficiary", "provider", "payment_method_details", "payment_method_information", "updated_at", "description", "created_by", "customer", "currency", "payment_method_type", "payment_intent", "transactions", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["failure_code"]) -> MetaOapg.properties.failure_code: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["failure_message"]) -> MetaOapg.properties.failure_message: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["amount"]) -> MetaOapg.properties.amount: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["metadata"]) -> MetaOapg.properties.metadata: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["beneficiary"]) -> MetaOapg.properties.beneficiary: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["provider"]) -> 'EnumPaymentLinkProvider': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_method_details"]) -> MetaOapg.properties.payment_method_details: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_method_information"]) -> MetaOapg.properties.payment_method_information: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["updated_at"]) -> MetaOapg.properties.updated_at: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["description"]) -> typing.Union[MetaOapg.properties.description, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_by"]) -> typing.Union[MetaOapg.properties.created_by, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["customer"]) -> typing.Union[MetaOapg.properties.customer, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> typing.Union['EnumPaymentsCurrency', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_method_type"]) -> typing.Union['EnumPaymentLinkAllowedPaymentMethod', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["payment_intent"]) -> typing.Union[MetaOapg.properties.payment_intent, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["transactions"]) -> typing.Union[MetaOapg.properties.transactions, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "created_at", "failure_code", "failure_message", "status", "amount", "metadata", "beneficiary", "provider", "payment_method_details", "payment_method_information", "updated_at", "description", "created_by", "customer", "currency", "payment_method_type", "payment_intent", "transactions", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        amount: typing.Union[MetaOapg.properties.amount, None, str, ],
        failure_code: typing.Union[MetaOapg.properties.failure_code, None, str, ],
        metadata: typing.Union[MetaOapg.properties.metadata, dict, frozendict.frozendict, ],
        beneficiary: typing.Union[MetaOapg.properties.beneficiary, str, uuid.UUID, ],
        updated_at: typing.Union[MetaOapg.properties.updated_at, None, str, datetime, ],
        provider: 'EnumPaymentLinkProvider',
        payment_method_information: typing.Union[MetaOapg.properties.payment_method_information, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        payment_method_details: typing.Union[MetaOapg.properties.payment_method_details, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, ],
        failure_message: typing.Union[MetaOapg.properties.failure_message, None, str, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, ],
        status: typing.Union[MetaOapg.properties.status, str, ],
        description: typing.Union[MetaOapg.properties.description, str, schemas.Unset] = schemas.unset,
        created_by: typing.Union[MetaOapg.properties.created_by, str, uuid.UUID, schemas.Unset] = schemas.unset,
        customer: typing.Union[MetaOapg.properties.customer, str, uuid.UUID, schemas.Unset] = schemas.unset,
        currency: typing.Union['EnumPaymentsCurrency', schemas.Unset] = schemas.unset,
        payment_method_type: typing.Union['EnumPaymentLinkAllowedPaymentMethod', schemas.Unset] = schemas.unset,
        payment_intent: typing.Union[MetaOapg.properties.payment_intent, str, uuid.UUID, schemas.Unset] = schemas.unset,
        transactions: typing.Union[MetaOapg.properties.transactions, list, tuple, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Charge':
        return super().__new__(
            cls,
            *args,
            amount=amount,
            failure_code=failure_code,
            metadata=metadata,
            beneficiary=beneficiary,
            updated_at=updated_at,
            provider=provider,
            payment_method_information=payment_method_information,
            payment_method_details=payment_method_details,
            created_at=created_at,
            failure_message=failure_message,
            id=id,
            status=status,
            description=description,
            created_by=created_by,
            customer=customer,
            currency=currency,
            payment_method_type=payment_method_type,
            payment_intent=payment_intent,
            transactions=transactions,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.charge_payment_method_details_ofpi import ChargePaymentMethodDetailsOfpi
from belvo_client.model.charge_payment_method_details_pse import ChargePaymentMethodDetailsPse
from belvo_client.model.enum_payment_link_allowed_payment_method import EnumPaymentLinkAllowedPaymentMethod
from belvo_client.model.enum_payment_link_provider import EnumPaymentLinkProvider
from belvo_client.model.enum_payments_currency import EnumPaymentsCurrency
from belvo_client.model.payment_method_information_pse import PaymentMethodInformationPse
from belvo_client.model.payment_transaction import PaymentTransaction
