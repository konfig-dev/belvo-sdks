/*
 * Belvo API Docs
 * # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
 *
 * The version of the OpenAPI document: 1.35.0
 * Contact: support@belvo.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.belvo.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The transactions subcategory.    &gt; **Get transaction categorization**   For clients not using our [Transaction categorization](https://developers.belvo.com/docs/banking#categorizing-transactions), we return &#x60;null&#x60; instead. To enable this feature, just [reach out](https://belvo.com/contact/?utm_source&#x3D;documentation) to us, and we&#39;ll get right to it.   We return one of the following enum values:    - &#x60;Electricity &amp; Energy&#x60;   - &#x60;Rent&#x60;   - &#x60;Telecommunications&#x60;   - &#x60;Water&#x60;   - &#x60;Auto&#x60;   - &#x60;Credit Card&#x60;   - &#x60;Instalment&#x60;   - &#x60;Interest &amp; Charges&#x60;   - &#x60;Mortgage&#x60;   - &#x60;Pay Advance&#x60;   - &#x60;Personal&#x60;   - &#x60;Adjustments&#x60;   - &#x60;Bank Fees&#x60;   - &#x60;Chargeback&#x60;   - &#x60;Refund&#x60;   - &#x60;Blocked Balances&#x60;   - &#x60;Alimony&#x60;   - &#x60;Alcohol &amp; Tobacco&#x60;   - &#x60;Bakery &amp; Coffee&#x60;   - &#x60;Bars &amp; Nightclubs&#x60;   - &#x60;Convenience Store&#x60;   - &#x60;Delivery&#x60;   - &#x60;Groceries&#x60;   - &#x60;Restaurants&#x60;   - &#x60;Education&#x60;   - &#x60;Gyms &amp; Fitness&#x60;   - &#x60;Hair &amp; Beauty&#x60;   - &#x60;Health&#x60;   - &#x60;Home Decor &amp; Appliances&#x60;   - &#x60;Laundry &amp; Dry Cleaning&#x60;   - &#x60;Pharmacies&#x60;   - &#x60;Professional Services&#x60;   - &#x60;Veterinary Services&#x60;   - &#x60;Freelance&#x60;   - &#x60;Interest&#x60;   - &#x60;Retirement&#x60;   - &#x60;Salary&#x60;   - &#x60;Government&#x60;   - &#x60;Home Insurance&#x60;   - &#x60;Auto Insurance&#x60;   - &#x60;Health &amp; Life Insurance&#x60;   - &#x60;Savings&#x60;   - &#x60;Fixed income&#x60;   - &#x60;Equity&#x60;   - &#x60;Investment Funds&#x60;   - &#x60;Derivatives&#x60;   - &#x60;Cryptocurrencies&#x60;   - &#x60;Apps, Software and Cloud Services&#x60;   - &#x60;Events, Parks and Museums&#x60;   - &#x60;Gambling&#x60;   - &#x60;Gaming&#x60;   - &#x60;Lottery&#x60;   - &#x60;Movie &amp; Audio&#x60;   - &#x60;Books &amp; News&#x60;   - &#x60;Clothing &amp; Accessories&#x60;   - &#x60;Department Store&#x60;   - &#x60;Electronics&#x60;   - &#x60;E-commerce&#x60;   - &#x60;Gifts&#x60;   - &#x60;Office Supplies&#x60;   - &#x60;Pet Supplies&#x60;   - &#x60;Auto Tax &amp; Fees&#x60;   - &#x60;Donation&#x60;   - &#x60;Government Fees&#x60;   - &#x60;Income Tax&#x60;   - &#x60;Real Estate Tax &amp; Fees&#x60;   - &#x60;Tax Return&#x60;   - &#x60;Accommodation&#x60;   - &#x60;Auto Expenses&#x60;   - &#x60;Auto Rental&#x60;   - &#x60;Flights&#x60;   - &#x60;Gas&#x60;   - &#x60;Mileage Programs&#x60;   - &#x60;Parking &amp; Tolls&#x60;   - &#x60;Public Transit&#x60;   - &#x60;Taxis &amp; Rideshares&#x60;   - &#x60;Other&#x60;   - &#x60;null&#x60;
 */
@JsonAdapter(EnumTransactionSubcategory.Adapter.class)
public enum EnumTransactionSubcategory {
  
  ELECTRICITY_ENERGY("Electricity & Energy"),
  
  RENT("Rent"),
  
  TELECOMMUNICATIONS("Telecommunications"),
  
  WATER("Water"),
  
  AUTO("Auto"),
  
  CREDIT_CARD("Credit Card"),
  
  INSTALMENT("Instalment"),
  
  INTEREST_CHARGES("Interest & Charges"),
  
  MORTGAGE("Mortgage"),
  
  PAY_ADVANCE("Pay Advance"),
  
  PERSONAL("Personal"),
  
  ADJUSTMENTS("Adjustments"),
  
  BANK_FEES("Bank Fees"),
  
  CHARGEBACK("Chargeback"),
  
  REFUND("Refund"),
  
  BLOCKED_BALANCES("Blocked Balances"),
  
  ALIMONY("Alimony"),
  
  ALCOHOL_TOBACCO("Alcohol & Tobacco"),
  
  BAKERY_COFFEE("Bakery & Coffee"),
  
  BARS_NIGHTCLUBS("Bars & Nightclubs"),
  
  CONVENIENCE_STORE("Convenience Store"),
  
  DELIVERY("Delivery"),
  
  GROCERIES("Groceries"),
  
  RESTAURANTS("Restaurants"),
  
  EDUCATION("Education"),
  
  GYMS_FITNESS("Gyms & Fitness"),
  
  HAIR_BEAUTY("Hair & Beauty"),
  
  HEALTH("Health"),
  
  HOME_DECOR_APPLIANCES("Home Decor & Appliances"),
  
  LAUNDRY_DRY_CLEANING("Laundry & Dry Cleaning"),
  
  PHARMACIES("Pharmacies"),
  
  PROFESSIONAL_SERVICES("Professional Services"),
  
  VETERINARY_SERVICES("Veterinary Services"),
  
  FREELANCE("Freelance"),
  
  INTEREST("Interest"),
  
  RETIREMENT("Retirement"),
  
  SALARY("Salary"),
  
  GOVERNMENT("Government"),
  
  HOME_INSURANCE("Home Insurance"),
  
  AUTO_INSURANCE("Auto Insurance"),
  
  HEALTH_LIFE_INSURANCE("Health & Life Insurance"),
  
  SAVINGS("Savings"),
  
  FIXED_INCOME("Fixed income"),
  
  EQUITY("Equity"),
  
  INVESTMENT_FUNDS("Investment Funds"),
  
  DERIVATIVES("Derivatives"),
  
  CRYPTOCURRENCIES("Cryptocurrencies"),
  
  APPS_SOFTWARE_AND_CLOUD_SERVICES("Apps, Software and Cloud Services"),
  
  EVENTS_PARKS_AND_MUSEUMS("Events, Parks and Museums"),
  
  GAMBLING("Gambling"),
  
  GAMING("Gaming"),
  
  LOTTERY("Lottery"),
  
  MOVIE_AUDIO("Movie & Audio"),
  
  BOOKS_NEWS("Books & News"),
  
  CLOTHING_ACCESSORIES("Clothing & Accessories"),
  
  DEPARTMENT_STORE("Department Store"),
  
  ELECTRONICS("Electronics"),
  
  E_COMMERCE("E-commerce"),
  
  GIFTS("Gifts"),
  
  OFFICE_SUPPLIES("Office Supplies"),
  
  PET_SUPPLIES("Pet Supplies"),
  
  AUTO_TAX_FEES("Auto Tax & Fees"),
  
  DONATION("Donation"),
  
  GOVERNMENT_FEES("Government Fees"),
  
  INCOME_TAX("Income Tax"),
  
  REAL_ESTATE_TAX_FEES("Real Estate Tax & Fees"),
  
  TAX_RETURN("Tax Return"),
  
  ACCOMMODATION("Accommodation"),
  
  AUTO_EXPENSES("Auto Expenses"),
  
  AUTO_RENTAL("Auto Rental"),
  
  FLIGHTS("Flights"),
  
  GAS("Gas"),
  
  MILEAGE_PROGRAMS("Mileage Programs"),
  
  PARKING_TOLLS("Parking & Tolls"),
  
  PUBLIC_TRANSIT("Public Transit"),
  
  TAXIS_RIDESHARES("Taxis & Rideshares"),
  
  OTHER("Other"),
  
  NULL("null");

  private String value;

  EnumTransactionSubcategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumTransactionSubcategory fromValue(String value) {
    for (EnumTransactionSubcategory b : EnumTransactionSubcategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumTransactionSubcategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumTransactionSubcategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumTransactionSubcategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumTransactionSubcategory.fromValue(value);
    }
  }
}

