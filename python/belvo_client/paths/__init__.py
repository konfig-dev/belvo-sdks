# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from belvo_client.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    API_LINKS = "/api/links"
    API_LINKS_ID = "/api/links/{id}"
    API_ACCOUNTS = "/api/accounts"
    API_ACCOUNTS_ID = "/api/accounts/{id}"
    API_TRANSACTIONS = "/api/transactions"
    API_TRANSACTIONS_ID = "/api/transactions/{id}"
    API_BALANCES = "/api/balances"
    API_BALANCES_ID = "/api/balances/{id}"
    API_INSTITUTIONS = "/api/institutions"
    API_INSTITUTIONS_ID = "/api/institutions/{id}"
    API_OWNERS = "/api/owners"
    API_OWNERS_ID = "/api/owners/{id}"
    API_INVOICES = "/api/invoices"
    API_INVOICES_ID = "/api/invoices/{id}"
    API_TAXRETURNS = "/api/tax-returns"
    API_TAXRETURNS_ID = "/api/tax-returns/{id}"
    API_TAXSTATUS = "/api/tax-status"
    API_TAXSTATUS_ID = "/api/tax-status/{id}"
    API_TAXCOMPLIANCESTATUS = "/api/tax-compliance-status"
    API_TAXCOMPLIANCESTATUS_ID = "/api/tax-compliance-status/{id}"
    API_INCOMES = "/api/incomes"
    API_INCOMES_ID = "/api/incomes/{id}"
    API_RECURRINGEXPENSES = "/api/recurring-expenses"
    API_RECURRINGEXPENSES_ID = "/api/recurring-expenses/{id}"
    INVESTMENTS_PORTFOLIOS = "/investments/portfolios"
    INVESTMENTS_PORTFOLIOS_ID = "/investments/portfolios/{id}"
    RECEIVABLES_TRANSACTIONS = "/receivables/transactions"
    RECEIVABLES_TRANSACTIONS_ID = "/receivables/transactions/{id}"
    API_RISKINSIGHTS = "/api/risk-insights"
    API_RISKINSIGHTS_ID = "/api/risk-insights/{id}"
    API_TAXRETENTIONS = "/api/tax-retentions"
    API_TAXRETENTIONS_ID = "/api/tax-retentions/{id}"
    API_TAXDECLARATIONS = "/api/tax-declarations"
    API_TAXDECLARATIONS_ID = "/api/tax-declarations/{id}"
    API_EMPLOYMENTRECORDS = "/api/employment-records"
    API_EMPLOYMENTRECORDS_ID = "/api/employment-records/{id}"
    API_ENRICH_INCOMES = "/api/enrich/incomes"
    API_CATEGORIZATION = "/api/categorization"
    PAYMENTS_SECRETKEYS = "/payments/secret-keys"
    PAYMENTS_INSTITUTIONS = "/payments/institutions"
    PAYMENTS_INSTITUTIONS_ID = "/payments/institutions/{id}"
    PAYMENTS_CUSTOMERS = "/payments/customers"
    PAYMENTS_CUSTOMERS_ID = "/payments/customers/{id}"
    PAYMENTS_BANKACCOUNTS = "/payments/bank-accounts"
    PAYMENTS_BANKACCOUNTS_ID = "/payments/bank-accounts/{id}"
    PAYMENTS_PAYMENTLINKS = "/payments/payment-links"
    PAYMENTS_PAYMENTLINKS_ACCESS_TOKEN = "/payments/payment-links/{access_token}"
    PAYMENTS_PAYMENTINTENTS = "/payments/payment-intents"
    PAYMENTS_PAYMENTINTENTS_ID = "/payments/payment-intents/{id}"
    PAYMENTS_TRANSACTIONS = "/payments/transactions"
    PAYMENTS_TRANSACTIONS_ID = "/payments/transactions/{id}"
