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


class EmploymentRecord(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Emploment record response payload
    """


    class MetaOapg:
        
        class properties:
            id = schemas.UUIDSchema
            link = schemas.UUIDSchema
            created_at = schemas.DateTimeSchema
            collected_at = schemas.DateTimeSchema
            report_date = schemas.DateSchema
            internal_identification = schemas.StrSchema
        
            @staticmethod
            def personal_data() -> typing.Type['EmploymentRecordPersonalData']:
                return EmploymentRecordPersonalData
        
            @staticmethod
            def social_security_summary() -> typing.Type['EmploymentRecordSocialSecuritySummary']:
                return EmploymentRecordSocialSecuritySummary
            
            
            class employment_records(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['EmploymentRecordDetail']:
                        return EmploymentRecordDetail
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['EmploymentRecordDetail'], typing.List['EmploymentRecordDetail']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'employment_records':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'EmploymentRecordDetail':
                    return super().__getitem__(i)
            
            
            class files(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['EmploymentRecordFile']:
                        return EmploymentRecordFile
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['EmploymentRecordFile'], typing.List['EmploymentRecordFile']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'files':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'EmploymentRecordFile':
                    return super().__getitem__(i)
            __annotations__ = {
                "id": id,
                "link": link,
                "created_at": created_at,
                "collected_at": collected_at,
                "report_date": report_date,
                "internal_identification": internal_identification,
                "personal_data": personal_data,
                "social_security_summary": social_security_summary,
                "employment_records": employment_records,
                "files": files,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["link"]) -> MetaOapg.properties.link: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_at"]) -> MetaOapg.properties.created_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["collected_at"]) -> MetaOapg.properties.collected_at: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["report_date"]) -> MetaOapg.properties.report_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["internal_identification"]) -> MetaOapg.properties.internal_identification: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["personal_data"]) -> 'EmploymentRecordPersonalData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["social_security_summary"]) -> 'EmploymentRecordSocialSecuritySummary': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["employment_records"]) -> MetaOapg.properties.employment_records: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["files"]) -> MetaOapg.properties.files: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "link", "created_at", "collected_at", "report_date", "internal_identification", "personal_data", "social_security_summary", "employment_records", "files", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["link"]) -> typing.Union[MetaOapg.properties.link, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_at"]) -> typing.Union[MetaOapg.properties.created_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["collected_at"]) -> typing.Union[MetaOapg.properties.collected_at, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["report_date"]) -> typing.Union[MetaOapg.properties.report_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["internal_identification"]) -> typing.Union[MetaOapg.properties.internal_identification, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["personal_data"]) -> typing.Union['EmploymentRecordPersonalData', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["social_security_summary"]) -> typing.Union['EmploymentRecordSocialSecuritySummary', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["employment_records"]) -> typing.Union[MetaOapg.properties.employment_records, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["files"]) -> typing.Union[MetaOapg.properties.files, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "link", "created_at", "collected_at", "report_date", "internal_identification", "personal_data", "social_security_summary", "employment_records", "files", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        link: typing.Union[MetaOapg.properties.link, str, uuid.UUID, schemas.Unset] = schemas.unset,
        created_at: typing.Union[MetaOapg.properties.created_at, str, datetime, schemas.Unset] = schemas.unset,
        collected_at: typing.Union[MetaOapg.properties.collected_at, str, datetime, schemas.Unset] = schemas.unset,
        report_date: typing.Union[MetaOapg.properties.report_date, str, date, schemas.Unset] = schemas.unset,
        internal_identification: typing.Union[MetaOapg.properties.internal_identification, str, schemas.Unset] = schemas.unset,
        personal_data: typing.Union['EmploymentRecordPersonalData', schemas.Unset] = schemas.unset,
        social_security_summary: typing.Union['EmploymentRecordSocialSecuritySummary', schemas.Unset] = schemas.unset,
        employment_records: typing.Union[MetaOapg.properties.employment_records, list, tuple, schemas.Unset] = schemas.unset,
        files: typing.Union[MetaOapg.properties.files, list, tuple, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'EmploymentRecord':
        return super().__new__(
            cls,
            *args,
            id=id,
            link=link,
            created_at=created_at,
            collected_at=collected_at,
            report_date=report_date,
            internal_identification=internal_identification,
            personal_data=personal_data,
            social_security_summary=social_security_summary,
            employment_records=employment_records,
            files=files,
            _configuration=_configuration,
            **kwargs,
        )

from belvo_client.model.employment_record_detail import EmploymentRecordDetail
from belvo_client.model.employment_record_file import EmploymentRecordFile
from belvo_client.model.employment_record_personal_data import EmploymentRecordPersonalData
from belvo_client.model.employment_record_social_security_summary import EmploymentRecordSocialSecuritySummary