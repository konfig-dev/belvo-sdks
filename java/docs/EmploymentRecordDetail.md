

# EmploymentRecordDetail

Details regarding the individual's employment history.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |
|**employer** | **String** | The official name of the employer.  |  [optional] |
|**employerId** | **String** | The official ID of the employer, according to the country.  |  [optional] |
|**startDate** | **LocalDate** | Date when employment started, in &#x60;YYYY-MM-DD&#x60; format.  |  [optional] |
|**endDate** | **LocalDate** | Date when employment finished, in &#x60;YYYY-MM-DD&#x60; format.  |  [optional] |
|**weeksEmployed** | **Integer** | Number of weeks that the individual was employed.  |  [optional] |
|**state** | **String** | In what geographical state the individual was employed, according to the country.  |  [optional] |
|**mostRecentBaseSalary** | **Float** | The most recent base salary the individual earned.  For Mexico, this is the *daily* rate that the individual earned, including the perks that the individual is entitled to throughout the year.  |  [optional] |
|**monthlySalary** | **Float** | The monthly salary of the individual, including any additional perks.  |  [optional] |
|**currency** | **String** | The three-letter currency code in which the salary is paid.  |  [optional] |
|**employmentStatusUpdates** | [**List&lt;EmploymentRecordEmploymentStatusUpdates&gt;**](EmploymentRecordEmploymentStatusUpdates.md) | Details regarding any employment changes of the individual. |  [optional] |



