package dto;

import java.nio.charset.Charset;

public class BusConstants {

    public static final String EMPTY = "";
    public static final String SPACE = " ";
    public static final String SLASH = "|";
    public static final String DASH = "-";
    public static final String DELIMITER = "#";
    public static final String DASH_SPACE = " - ";
    public static final int SESSION_SIZE = 32;
    public static final int HASH_SIZE = 36;
    public static final int COUNTRY_CODE_SIZE = 2;
    public static final int STATION_PREFIX_MIN_SIZE = 2;
    public static final int STATION_PREFIX_MAX_SIZE = 64;
    public static final int CARD_SIZE = 20;
    public static final int CARD_TOKEN_SIZE = 50;
    public static final int MAX_VALUE_SIZE = 1024;
    public static final int PAYMENT_SYSTEM_ID_SIZE = 3;
    public static final int PAYMENT_TYPE_ID_SIZE = 3;
    public static final int MIN_SEATS_SIZE = 1;
    public static final int MIN_SEAT_NUMBER_LENGTH = 1;
    public static final int MAX_SEAT_NUMBER_LENGTH = 6;
    public static final int UID_MIN_SIZE = 16;
    public static final int UID_MAX_SIZE = 32;
    public static final int CHAMELEON_SESSION_SIZE = 20;
    public static final int NAME_MAX_SIZE = 32;
    public static final int SURNAME_MAX_SIZE = 32;
    public static final int LDAP_LENGTH = 20;
    public static final int BRANCH_LENGTH = 4;
    public static final int POINT_ID_LENGTH = 50;

    public static final String CONFIG_SOURCE_NAME = "${bus_config}";
    public static final String CONFIG_FILE_NAME = "bus_config";

    public static final String SCC_SELL_BEAN = "SCC_SELL_BEAN";
    public static final String SCC_RETURN_BEAN = "SCC_RETURN_BEAN";
    public static final String INFO_BUS_BEAN_NAME = "INFO_BUS_BEAN_NAME";
    public static final String DOPAS_BEAN_NAME = "DOPAS_BEAN_NAME";
    public static final String DOPAS_SERVICE_BEAN = "DOPAS_SERVICE_BEAN";
    public static final String DOPAS_CONVERTER = "DOPAS_CONVERTER";
    public static final String SAN_AVTO_BEAN_NAME = "SAN_AVTO_BEAN_NAME";
    public static final String VPI_BEAN_NAME = "VPI_BEAN_NAME";
    public static final String ARGEST_BEAN_NAME = "ARGEST_BEAN_NAME";
    public static final String STANDARD_ADAPTER_BEAN_NAME = "STANDARD_ADAPTER_BEAN_NAME";
    public static final String BUSFOR_BEAN_NAME = "BUSFOR_BEAN_NAME";
    public static final String EURO_CLUB_BEAN_NAME = "EURO_CLUB_BEAN_NAME";
    public static final String SUMY_BEAN_NAME = "SUMY_BEAN_NAME";
    public static final String SUMY_CONVERTER = "SUMY_CONVERTER";
    public static final String ECOLINES_BEAN_NAME = "ECOLINES_BEAN_NAME";
    public static final String SUMY_SERVICE_BEAN = "SUMY_SERVICE_BEAN";
    public static final String ODRI_BEAN_NAME = "ODRI_BEAN_NAME";

    public static final String SUMY_HTTP_CONNECTOR_BEAN = "SumyHttpConnectorBean";
    public static final String SUMY_SALE_HTTP_CONNECTOR_BEAN = "SumySaleHttpConnectorBean";
    public static final String DOPAS_HTTP_CONNECTOR_BEAN = "DopasHttpConnectorBean";
    public static final String DOPAS_SALE_HTTP_CONNECTOR_BEAN = "DopasSaleHttpConnectorBean";
    public static final String SALE_HTTP_CONNECTOR_BEAN = "SaleHttpConnectorBean";
    public static final String PDF_HTTP_CONNECTOR_BEAN = "PdfHttpConnectorBean";

    public static final String SOCKET_SALE_CONNECTOR_BEAN = "SocketSaleConnectorBean";
    public static final String SOCKET_CONNECTOR_BEAN = "SocketConnectorBean";

    public static final Charset WINDOWS_1251_CHARSET = Charset.forName("windows-1251");
    public static final Charset UTF_8_CHARSET = Charset.forName("utf-8");
    public static final String OUTER_ORDER_INFO = "outer_order_info";

    public static final String RETURN_TICKET_EXCHANGE = "bus_returnTicket_ex";
    public static final String RETURN_TICKET_QUEUE = "bus_returnTicket_q";
    public static final String RETURN_TICKET_LISTENER_BEAN = "returnTicketListenerBean";

    public static final String PRINT_BLANK_EXCHANGE_IN_CASHBOX = "1";
    public static final String PRINT_BLANK_GOTO_BUS = "2";
    public static final String SHOW_BLANK_EXCHANGE_IN_CASHBOX = "3";
    public static final String SHOW_BLANK_IN_BUS = "4";

    //Service resources
    public static class Endpoints {
        public static final String PING = "/ping";
        public static final String COUNTRIES = "/countries";
        public static final String STATIONS = "/stations";
        public static final String DEPARTURE_STATIONS = "/stations/departure";
        public static final String ARRIVAL_STATIONS = "/stations/arrival";
        public static final String SEARCH = "/search";
        public static final String ROUTE = "/route";
        public static final String CREATE_ORDER = "/order/create";
        public static final String SELL_ORDER = "/order/sell";
        public static final String REJECT_ORDER = "/order/reject";
        public static final String ORDER_ARCHIVE = "/order/archive";
        public static final String ORDER_PRINT = "/order/print";
        public static final String ORDER_PDF = "/resource/pdf/order";
        public static final String ORDER_EMAIL = "/resource/email/order";
        public static final String RETURN_TICKET = "/ticket/return";
        public static final String RETURN_TICKET_INFO = "/ticket/return/info";
        public static final String TICKET_STATUS_INFO = "/ticket/status/info";
        public static final String ORDER_STATE = "/order/state";
        public static final String ROUTE_DETAILED = "/route/detailed";
        public static final String ORDER_CAN_SELL = "/order/can/sell";
        public static final String ORDER_FIND = "/order/find";
        public static final String CLIENT_RECENT_PURCHASES = "/client/recent/purchases";
        public static final String CLIENT_TOP_STATIONS = "/client/top/stations";
    }

    //XML/JSON properties
    public static class Properties {

        public static final String REQUEST = "request";
        public static final String RESPONSE = "response";
        public static final String SESSION = "session";
        public static final String ERROR = "error";
        public static final String CODE = "code";
        public static final String MESSAGE = "message";
        public static final String REGISTER_CODE = "registerCode";
        public static final String DETAIL = "detail";
        public static final String EXT_ID = "extId";
        public static final String COUNTRIES = "countries";
        public static final String COUNTRY = "country";
        public static final String STATIONS = "stations";
        public static final String STATION = "station";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String PATRONYMIC = "patronymic";
        public static final String PATRONYMIC_NEEDED = "isPatronymicNeeded";
        public static final String SURNAME = "surname";
        public static final String COUNTRY_ID = "countryId";
        public static final String UID = "uid";
        public static final String CHAMELEON_SESSION = "chameleonSession";
        public static final String ROUTES = "routes";
        public static final String ROUTE = "route";
        public static final String ROUTE_HASH = "routeHash";
        public static final String FROM = "from";
        public static final String TO = "to";
        public static final String DATE = "date";
        public static final String LANG = "lang";
        public static final String HASH = "hash";
        public static final String DESCRIPTION = "description";
        public static final String STATION_FROM_ID = "stationFromId";
        public static final String STATION_FROM_NAME = "stationFromName";
        public static final String STATION_FROM_DESCRIPTION = "stationFromDescription";
        public static final String DATE_TIME_FROM = "dateTimeFrom";
        public static final String STATION_TO_ID = "stationToId";
        public static final String STATION_TO_NAME = "stationToName";
        public static final String STATION_TO_DESCRIPTION = "stationToDescription";
        public static final String DATE_TIME_TO = "dateTimeTo";
        public static final String TRAVEL_TIME = "travelTime";
        public static final String PRICE = "price";
        public static final String FREE_SEATS = "freeSeats";
        public static final String DOCUMENT_TYPES = "documentTypes";
        public static final String DOCUMENT_TYPE = "documentType";
        public static final String SEAT = "seat";
        public static final String SEATS = "seats";
        public static final String PHONE = "phone";
        public static final String BIRTHDAY = "birthday";
        public static final String DOCUMENT_SERIES = "documentSeries";
        public static final String DOCUMENT_NUMBER = "documentNumber";
        public static final String DOCUMENT_TYPE_ID = "documentTypeId";
        public static final String NUMBER = "number";
        public static final String PASSENGER = "passenger";
        public static final String PREFIX = "prefix";
        public static final String DISCOUNTS = "discounts";
        public static final String DISCOUNT = "discount";
        public static final String DISCOUNT_ID = "discountId";
        public static final String REQUIREMENTS = "requirements";
        public static final String PASSENGER_BIRTHDAY = "passengerBirthday";
        public static final String PASSENGER_DOCUMENT = "passengerDocument";
        public static final String FIO_IN_LATIN_ON_CREATE_NEEDED = "isFioLatinNeeded";
        public static final String FIO_IN_LATIN = "fioInLatin";
        public static final String EMAIL_ON_CREATE_NEEDED = "isEmailOnCreateNeeded";
        public static final String CITIZENSHIP_NEEDED = "isCitizenshipNeeded";
        public static final String CITIZENSHIP = "citizenship";
        public static final String GENDER_NEEDED = "isGenderNeeded";
        public static final String GENDER = "gender";
        public static final String GENDERS = "genders";
        public static final String ORDER = "order";
        public static final String ORDER_HASH = "orderHash";
        public static final String LIQ_PAY = "liqPay";
        public static final String TICKET_COUNT = "ticketCount";
        public static final String MAX_TICKET_COUNT = "maxTicketCount";
        public static final String MIN_TICKET_COUNT = "minTicketCount";
        public static final String VENDOR_COMMISSION = "vendorCommission";
        public static final String PAYMENT = "payment";
        public static final String PAYER = "payer";
        public static final String PAYER_COMMISSION = "payerCommission";
        public static final String MERCHANT = "merchant";
        public static final String CARD = "card";
        public static final String FULL_NAME = "fullName";
        public static final String EMAIL = "email";
        public static final String REFERENCE = "reference";
        public static final String SYSTEM_ID = "systemId";
        public static final String TYPE_ID = "typeId";
        public static final String POINT_ID = "pointId";
        public static final String CARD_TYPE = "cardType";
        public static final String CARD_TOKEN = "cardToken";
        public static final String COUNTRY_CODE = "countryCode";
        public static final String FREE_SEATS_COUNT = "freeSeatsCount";
        public static final String BIPLANE = "biplane";
        public static final String BIPLANE_ID = "biplaneId";
        public static final String ACCOUNT = "account";
        public static final String MFO = "mfo";
        public static final String OKPO = "okpo";
        public static final String VENDOR_ID = "vendorId";
        public static final String PDF = "pdf";
        public static final String ORDER_ID = "orderId";
        public static final String SEAT_NUMBER = "seatNumber";
        public static final String PASSENGER_PATRONYMIC = "passengerPatronymic";
        public static final String PASSENGER_SURNAME = "passengerSurname";
        public static final String PASSENGER_NAME = "passengerName";
        public static final String STATE = "state";
        public static final String TAX = "tax";
        public static final String TICKETS = "tickets";
        public static final String TICKET = "ticket";
        public static final String DATE_FROM = "dateFrom";
        public static final String DATE_TO = "dateTo";
        public static final String ORDERS = "orders";
        public static final String SELL_DATETIME = "sellDatetime";
        public static final String ROUTE_DESCRIPTION = "routeDescription";
        public static final String DEPARTURE_COUNTRY_NAME = "departureCountryName";
        public static final String DEPARTURE_COUNTRY_CODE = "departureCountryCode";
        public static final String ARRIVAL_COUNTRY_NAME = "arrivalCountryName";
        public static final String ARRIVAL_COUNTRY_CODE = "arrivalCountryCode";
        public static final String DEPARTURE_STATION_ID = "departureStationId";
        public static final String DEPARTURE_STATION_NAME = "departureStationName";
        public static final String DEPARTURE_STATION_DESCRIPTION = "departureStationDescription";
        public static final String ARRIVAL_STATION_ID = "arrivalStationId";
        public static final String ARRIVAL_STATION_NAME = "arrivalStationName";
        public static final String ARRIVAL_STATION_DESCRIPTION = "arrivalStationDescription";
        public static final String DEPARTURE_DATETIME = "departureDatetime";
        public static final String DEPARTURE_DATE = "departureDate";
        public static final String DEPARTURE_TIME = "departureTime";
        public static final String ARRIVAL_DATETIME = "arrivalDatetime";
        public static final String ARRIVAL_DATE = "arrivalDate";
        public static final String ARRIVAL_TIME = "arrivalTime";
        public static final String DIGITAL_CODE = "digitalCode";
        public static final String EKB_ID = "ekbId";
        public static final String ROUTE_NAME = "routeName";
        public static final String PLATFORM = "platform";
        public static final String CARRIER = "carrier";
        public static final String LUGGAGE = "luggage";
        public static final String FREE_REFUND_MINUTES = "freeRefundMinutes";
        public static final String RETENTIONS = "retentions";
        public static final String RETENTION = "retention";
        public static final String FROM_HOURS_BEFORE_DEPARTURE = "fromHoursBeforeDeparture";
        public static final String TO_HOURS_BEFORE_DEPARTURE = "toHoursBeforeDeparture";
        public static final String PERCENT = "percent";
        public static final String CAUSE = "cause";
        public static final String RETURN_ID = "returnId";
        public static final String RETURN_CONDITIONS = "returnConditions";
        public static final String RETURN_AMOUNT = "returnAmount";
        public static final String RETURN_COMM = "returnCommission";
        public static final String TICKET_COUNT_LIMIT = "ticketCountLimit";
        public static final String TICKET_STATUS = "ticketStatus";
        public static final String VENDOR_RESPONSE = "vendorResponse";
        public static final String SUM_RETURNED = "sumReturned";
        public static final String RETURN_DATE = "returnDate";
        public static final String STATION_TYPE = "stationType";
        public static final String RETURNABLE = "returnable";
        public static final String PRINTABLE = "printable";
        public static final String BUS_TYPE = "busType";
        public static final String LDAP = "ldap";
        public static final String BRANCH = "branch";
        public static final String CLIENT_ID = "clientId";
        public static final String EXTRA = "extra";
        public static final String IS_ELECTRONIC = "isElectronic";
        public static final String ELECTRONIC = "electronic";
        public static final String LATITUDE = "latitude";
        public static final String LONGITUDE = "longitude";
        public static final String CAN_SELL = "canSell";
        public static final String TAPI_UID = "tapiUID";
        public static final String TAPI_TICKET_ID = "tapiTicketId";
        public static final String INSURANCE_BRAND = "insuranceBrand";
        public static final String INSURANCE_ADDRESS = "insuranceAddress";
        public static final String INSURANCE_PHONE = "insurancePhone";
        public static final String INSURANCE_INFO = "insuranceInfo";
        public static final String CARRIER_TICKET_ID = "carrierTicketId";
        public static final String HEADER_INFO = "headerInfo";
        public static final String FOOTER_INFO = "footerInfo";
        public static final String CLIENT_RECENT_PURCHASES = "clientRecentPurchaseList";
        public static final String RESPONSE_HASH = "Hash";
        public static final String ARCHIVE_ADDITIONAL_INFO = "additionalInfo";
        public static final String EXCLUDE_STATIONS = "excludeStations";
        public static final String VENDOR_EXCHANGE_TICKET_ID = "vendorExchangeId";
        public static final String VENDOR_EXCHANGE_TICKET_TEXT = "vendorExchangeText";
    }

    public static class Patterns {
        public static final String SINGLE_QUOTE = "\'";
        public static final String DOUBLE_QUOTE = "\"";
        public static final String LANG_PATTERN =  "(UA|ua|RU|ru|EN|en)|";
        public static final String PHONE_PATTERN = "(\\+)?(\\d){10,15}";
        public static final String NAME_SURNAME_PATTERN = "[\\p{L}+[-'`’\" ]?]+";
        public static final String FULL_NAME_PATTERN = "[\\p{L}+[-'`’\" ]?]+";
        public static final String CLIENT_ID_PATTERN = "\\p{Digit}{0,17}";
        public static final String DIGITAL_CODE_PATTERN = "\\p{Digit}{15}";
    }

    public static enum TicketStatus {
        SOLD("Продан"),
        BOOKED("Забронирован"),
        RETURNED("Возвращен"),
        NOT_FOUND("Не найден"),
        CANCELED("Отменен"),
        UNKNOWN("Статус не определен");

        private String description;

        public String getDescription() {
            return description;
        }

        TicketStatus(String description) {
            this.description = description;
        }
    }
}