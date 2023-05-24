# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from belvo_client.paths.payments_customers_id import Api

from belvo_client.paths import PathValues

path = PathValues.PAYMENTS_CUSTOMERS_ID