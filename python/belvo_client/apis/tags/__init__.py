# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from belvo_client.apis.tag_to_api import tag_to_api

import enum


class TagValues(str, enum.Enum):
    LINKS = "Links"
    ACCOUNTS = "Accounts"
    TRANSACTIONS = "Transactions"
    BALANCES = "Balances"
    OWNERS = "Owners"
    INVESTMENT_PORTFOLIOS = "Investment Portfolios"
    INCOMES = "Incomes"
    RECURRING_EXPENSES = "Recurring Expenses"
    RISK_INSIGHTS = "Risk Insights"
    INVOICES = "Invoices"
    RECEIVABLE_TRANSACTIONS = "Receivable Transactions"
    EMPLOYMENT_RECORDS = "Employment Records"
    TAX_DECLARATIONS = "Tax declarations"
    TAX_RETURNS = "Tax returns"
    TAX_STATUS = "Tax status"
    TAX_RETENTIONS = "Tax retentions"
    TAX_COMPLIANCE_STATUS = "Tax compliance status"
    PAYMENT_INTENTS = "Payment Intents"
    CUSTOMERS = "Customers"
    BANK_ACCOUNTS = "Bank Accounts"
    PAYMENT_LINKS = "Payment Links"
    INSTITUTIONS = "Institutions"
    SECRET_KEYS = "Secret Keys"
    PAYMENT_INSTITUTIONS = "Payment Institutions"
    PAYMENT_TRANSACTIONS = "Payment Transactions"
    CATEGORIZATION = "Categorization"
    INCOME_VERIFICATION = "Income Verification"
    BANKING_API_INTRODUCTION = "Banking API introduction"
    ENRICHMENT_API_INTRODUCTION = "Enrichment API introduction"
    EYOD_API_INTRODUCTION = "EYOD API introduction"
    FISCAL_API_INTRODUCTION = "Fiscal API introduction"
    PAYMENT_INITIATION_INTRODUCTION = "Payment Initiation introduction"
