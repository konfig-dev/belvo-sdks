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


class EnumTransactionSubcategory(
    schemas.EnumBase,
    schemas.StrBase,
    schemas.NoneBase,
    schemas.Schema,
    schemas.NoneStrMixin
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    The transactions subcategory.

  > **Get transaction categorization**
  For clients not using our [Transaction categorization](https://developers.belvo.com/docs/banking#categorizing-transactions), we return `null` instead. To enable this feature, just [reach out](https://belvo.com/contact/?utm_source=documentation) to us, and we'll get right to it.


We return one of the following enum values:

  - `Electricity & Energy`
  - `Rent`
  - `Telecommunications`
  - `Water`
  - `Auto`
  - `Credit Card`
  - `Instalment`
  - `Interest & Charges`
  - `Mortgage`
  - `Pay Advance`
  - `Personal`
  - `Adjustments`
  - `Bank Fees`
  - `Chargeback`
  - `Refund`
  - `Blocked Balances`
  - `Alimony`
  - `Alcohol & Tobacco`
  - `Bakery & Coffee`
  - `Bars & Nightclubs`
  - `Convenience Store`
  - `Delivery`
  - `Groceries`
  - `Restaurants`
  - `Education`
  - `Gyms & Fitness`
  - `Hair & Beauty`
  - `Health`
  - `Home Decor & Appliances`
  - `Laundry & Dry Cleaning`
  - `Pharmacies`
  - `Professional Services`
  - `Veterinary Services`
  - `Freelance`
  - `Interest`
  - `Retirement`
  - `Salary`
  - `Government`
  - `Home Insurance`
  - `Auto Insurance`
  - `Health & Life Insurance`
  - `Savings`
  - `Fixed income`
  - `Equity`
  - `Investment Funds`
  - `Derivatives`
  - `Cryptocurrencies`
  - `Apps, Software and Cloud Services`
  - `Events, Parks and Museums`
  - `Gambling`
  - `Gaming`
  - `Lottery`
  - `Movie & Audio`
  - `Books & News`
  - `Clothing & Accessories`
  - `Department Store`
  - `Electronics`
  - `E-commerce`
  - `Gifts`
  - `Office Supplies`
  - `Pet Supplies`
  - `Auto Tax & Fees`
  - `Donation`
  - `Government Fees`
  - `Income Tax`
  - `Real Estate Tax & Fees`
  - `Tax Return`
  - `Accommodation`
  - `Auto Expenses`
  - `Auto Rental`
  - `Flights`
  - `Gas`
  - `Mileage Programs`
  - `Parking & Tolls`
  - `Public Transit`
  - `Taxis & Rideshares`
  - `Other`
  - `null`
    """


    class MetaOapg:
        enum_value_to_name = {
            "Electricity & Energy": "ELECTRICITY__ENERGY",
            "Rent": "RENT",
            "Telecommunications": "TELECOMMUNICATIONS",
            "Water": "WATER",
            "Auto": "AUTO",
            "Credit Card": "CREDIT_CARD",
            "Instalment": "INSTALMENT",
            "Interest & Charges": "INTEREST__CHARGES",
            "Mortgage": "MORTGAGE",
            "Pay Advance": "PAY_ADVANCE",
            "Personal": "PERSONAL",
            "Adjustments": "ADJUSTMENTS",
            "Bank Fees": "BANK_FEES",
            "Chargeback": "CHARGEBACK",
            "Refund": "REFUND",
            "Blocked Balances": "BLOCKED_BALANCES",
            "Alimony": "ALIMONY",
            "Alcohol & Tobacco": "ALCOHOL__TOBACCO",
            "Bakery & Coffee": "BAKERY__COFFEE",
            "Bars & Nightclubs": "BARS__NIGHTCLUBS",
            "Convenience Store": "CONVENIENCE_STORE",
            "Delivery": "DELIVERY",
            "Groceries": "GROCERIES",
            "Restaurants": "RESTAURANTS",
            "Education": "EDUCATION",
            "Gyms & Fitness": "GYMS__FITNESS",
            "Hair & Beauty": "HAIR__BEAUTY",
            "Health": "HEALTH",
            "Home Decor & Appliances": "HOME_DECOR__APPLIANCES",
            "Laundry & Dry Cleaning": "LAUNDRY__DRY_CLEANING",
            "Pharmacies": "PHARMACIES",
            "Professional Services": "PROFESSIONAL_SERVICES",
            "Veterinary Services": "VETERINARY_SERVICES",
            "Freelance": "FREELANCE",
            "Interest": "INTEREST",
            "Retirement": "RETIREMENT",
            "Salary": "SALARY",
            "Government": "GOVERNMENT",
            "Home Insurance": "HOME_INSURANCE",
            "Auto Insurance": "AUTO_INSURANCE",
            "Health & Life Insurance": "HEALTH__LIFE_INSURANCE",
            "Savings": "SAVINGS",
            "Fixed income": "FIXED_INCOME",
            "Equity": "EQUITY",
            "Investment Funds": "INVESTMENT_FUNDS",
            "Derivatives": "DERIVATIVES",
            "Cryptocurrencies": "CRYPTOCURRENCIES",
            "Apps, Software and Cloud Services": "APPS_SOFTWARE_AND_CLOUD_SERVICES",
            "Events, Parks and Museums": "EVENTS_PARKS_AND_MUSEUMS",
            "Gambling": "GAMBLING",
            "Gaming": "GAMING",
            "Lottery": "LOTTERY",
            "Movie & Audio": "MOVIE__AUDIO",
            "Books & News": "BOOKS__NEWS",
            "Clothing & Accessories": "CLOTHING__ACCESSORIES",
            "Department Store": "DEPARTMENT_STORE",
            "Electronics": "ELECTRONICS",
            "E-commerce": "ECOMMERCE",
            "Gifts": "GIFTS",
            "Office Supplies": "OFFICE_SUPPLIES",
            "Pet Supplies": "PET_SUPPLIES",
            "Auto Tax & Fees": "AUTO_TAX__FEES",
            "Donation": "DONATION",
            "Government Fees": "GOVERNMENT_FEES",
            "Income Tax": "INCOME_TAX",
            "Real Estate Tax & Fees": "REAL_ESTATE_TAX__FEES",
            "Tax Return": "TAX_RETURN",
            "Accommodation": "ACCOMMODATION",
            "Auto Expenses": "AUTO_EXPENSES",
            "Auto Rental": "AUTO_RENTAL",
            "Flights": "FLIGHTS",
            "Gas": "GAS",
            "Mileage Programs": "MILEAGE_PROGRAMS",
            "Parking & Tolls": "PARKING__TOLLS",
            "Public Transit": "PUBLIC_TRANSIT",
            "Taxis & Rideshares": "TAXIS__RIDESHARES",
            "Other": "OTHER",
            None: "NONE",
        }
    
    @schemas.classproperty
    def ELECTRICITY__ENERGY(cls):
        return cls("Electricity & Energy")
    
    @schemas.classproperty
    def RENT(cls):
        return cls("Rent")
    
    @schemas.classproperty
    def TELECOMMUNICATIONS(cls):
        return cls("Telecommunications")
    
    @schemas.classproperty
    def WATER(cls):
        return cls("Water")
    
    @schemas.classproperty
    def AUTO(cls):
        return cls("Auto")
    
    @schemas.classproperty
    def CREDIT_CARD(cls):
        return cls("Credit Card")
    
    @schemas.classproperty
    def INSTALMENT(cls):
        return cls("Instalment")
    
    @schemas.classproperty
    def INTEREST__CHARGES(cls):
        return cls("Interest & Charges")
    
    @schemas.classproperty
    def MORTGAGE(cls):
        return cls("Mortgage")
    
    @schemas.classproperty
    def PAY_ADVANCE(cls):
        return cls("Pay Advance")
    
    @schemas.classproperty
    def PERSONAL(cls):
        return cls("Personal")
    
    @schemas.classproperty
    def ADJUSTMENTS(cls):
        return cls("Adjustments")
    
    @schemas.classproperty
    def BANK_FEES(cls):
        return cls("Bank Fees")
    
    @schemas.classproperty
    def CHARGEBACK(cls):
        return cls("Chargeback")
    
    @schemas.classproperty
    def REFUND(cls):
        return cls("Refund")
    
    @schemas.classproperty
    def BLOCKED_BALANCES(cls):
        return cls("Blocked Balances")
    
    @schemas.classproperty
    def ALIMONY(cls):
        return cls("Alimony")
    
    @schemas.classproperty
    def ALCOHOL__TOBACCO(cls):
        return cls("Alcohol & Tobacco")
    
    @schemas.classproperty
    def BAKERY__COFFEE(cls):
        return cls("Bakery & Coffee")
    
    @schemas.classproperty
    def BARS__NIGHTCLUBS(cls):
        return cls("Bars & Nightclubs")
    
    @schemas.classproperty
    def CONVENIENCE_STORE(cls):
        return cls("Convenience Store")
    
    @schemas.classproperty
    def DELIVERY(cls):
        return cls("Delivery")
    
    @schemas.classproperty
    def GROCERIES(cls):
        return cls("Groceries")
    
    @schemas.classproperty
    def RESTAURANTS(cls):
        return cls("Restaurants")
    
    @schemas.classproperty
    def EDUCATION(cls):
        return cls("Education")
    
    @schemas.classproperty
    def GYMS__FITNESS(cls):
        return cls("Gyms & Fitness")
    
    @schemas.classproperty
    def HAIR__BEAUTY(cls):
        return cls("Hair & Beauty")
    
    @schemas.classproperty
    def HEALTH(cls):
        return cls("Health")
    
    @schemas.classproperty
    def HOME_DECOR__APPLIANCES(cls):
        return cls("Home Decor & Appliances")
    
    @schemas.classproperty
    def LAUNDRY__DRY_CLEANING(cls):
        return cls("Laundry & Dry Cleaning")
    
    @schemas.classproperty
    def PHARMACIES(cls):
        return cls("Pharmacies")
    
    @schemas.classproperty
    def PROFESSIONAL_SERVICES(cls):
        return cls("Professional Services")
    
    @schemas.classproperty
    def VETERINARY_SERVICES(cls):
        return cls("Veterinary Services")
    
    @schemas.classproperty
    def FREELANCE(cls):
        return cls("Freelance")
    
    @schemas.classproperty
    def INTEREST(cls):
        return cls("Interest")
    
    @schemas.classproperty
    def RETIREMENT(cls):
        return cls("Retirement")
    
    @schemas.classproperty
    def SALARY(cls):
        return cls("Salary")
    
    @schemas.classproperty
    def GOVERNMENT(cls):
        return cls("Government")
    
    @schemas.classproperty
    def HOME_INSURANCE(cls):
        return cls("Home Insurance")
    
    @schemas.classproperty
    def AUTO_INSURANCE(cls):
        return cls("Auto Insurance")
    
    @schemas.classproperty
    def HEALTH__LIFE_INSURANCE(cls):
        return cls("Health & Life Insurance")
    
    @schemas.classproperty
    def SAVINGS(cls):
        return cls("Savings")
    
    @schemas.classproperty
    def FIXED_INCOME(cls):
        return cls("Fixed income")
    
    @schemas.classproperty
    def EQUITY(cls):
        return cls("Equity")
    
    @schemas.classproperty
    def INVESTMENT_FUNDS(cls):
        return cls("Investment Funds")
    
    @schemas.classproperty
    def DERIVATIVES(cls):
        return cls("Derivatives")
    
    @schemas.classproperty
    def CRYPTOCURRENCIES(cls):
        return cls("Cryptocurrencies")
    
    @schemas.classproperty
    def APPS_SOFTWARE_AND_CLOUD_SERVICES(cls):
        return cls("Apps, Software and Cloud Services")
    
    @schemas.classproperty
    def EVENTS_PARKS_AND_MUSEUMS(cls):
        return cls("Events, Parks and Museums")
    
    @schemas.classproperty
    def GAMBLING(cls):
        return cls("Gambling")
    
    @schemas.classproperty
    def GAMING(cls):
        return cls("Gaming")
    
    @schemas.classproperty
    def LOTTERY(cls):
        return cls("Lottery")
    
    @schemas.classproperty
    def MOVIE__AUDIO(cls):
        return cls("Movie & Audio")
    
    @schemas.classproperty
    def BOOKS__NEWS(cls):
        return cls("Books & News")
    
    @schemas.classproperty
    def CLOTHING__ACCESSORIES(cls):
        return cls("Clothing & Accessories")
    
    @schemas.classproperty
    def DEPARTMENT_STORE(cls):
        return cls("Department Store")
    
    @schemas.classproperty
    def ELECTRONICS(cls):
        return cls("Electronics")
    
    @schemas.classproperty
    def ECOMMERCE(cls):
        return cls("E-commerce")
    
    @schemas.classproperty
    def GIFTS(cls):
        return cls("Gifts")
    
    @schemas.classproperty
    def OFFICE_SUPPLIES(cls):
        return cls("Office Supplies")
    
    @schemas.classproperty
    def PET_SUPPLIES(cls):
        return cls("Pet Supplies")
    
    @schemas.classproperty
    def AUTO_TAX__FEES(cls):
        return cls("Auto Tax & Fees")
    
    @schemas.classproperty
    def DONATION(cls):
        return cls("Donation")
    
    @schemas.classproperty
    def GOVERNMENT_FEES(cls):
        return cls("Government Fees")
    
    @schemas.classproperty
    def INCOME_TAX(cls):
        return cls("Income Tax")
    
    @schemas.classproperty
    def REAL_ESTATE_TAX__FEES(cls):
        return cls("Real Estate Tax & Fees")
    
    @schemas.classproperty
    def TAX_RETURN(cls):
        return cls("Tax Return")
    
    @schemas.classproperty
    def ACCOMMODATION(cls):
        return cls("Accommodation")
    
    @schemas.classproperty
    def AUTO_EXPENSES(cls):
        return cls("Auto Expenses")
    
    @schemas.classproperty
    def AUTO_RENTAL(cls):
        return cls("Auto Rental")
    
    @schemas.classproperty
    def FLIGHTS(cls):
        return cls("Flights")
    
    @schemas.classproperty
    def GAS(cls):
        return cls("Gas")
    
    @schemas.classproperty
    def MILEAGE_PROGRAMS(cls):
        return cls("Mileage Programs")
    
    @schemas.classproperty
    def PARKING__TOLLS(cls):
        return cls("Parking & Tolls")
    
    @schemas.classproperty
    def PUBLIC_TRANSIT(cls):
        return cls("Public Transit")
    
    @schemas.classproperty
    def TAXIS__RIDESHARES(cls):
        return cls("Taxis & Rideshares")
    
    @schemas.classproperty
    def OTHER(cls):
        return cls("Other")
    
    @schemas.classproperty
    def NONE(cls):
        return cls(None)


    def __new__(
        cls,
        *args: typing.Union[None, str, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'EnumTransactionSubcategory':
        return super().__new__(
            cls,
            *args,
            _configuration=_configuration,
        )
