module commercetools.sdk.base {
    requires jsr305;
    requires org.apache.commons.lang3;
    requires java.base;
    requires com.fasterxml.jackson.databind;
    requires org.slf4j;
    requires failsafe;
    requires com.fasterxml.jackson.datatype.jsr310;

    exports io.vrap.rmf.base.client;
    exports io.vrap.rmf.base.client.http;
    exports io.vrap.rmf.base.client.oauth2;
    exports io.vrap.rmf.base.client.utils;
    exports io.vrap.rmf.base.client.utils.json;
    exports io.vrap.rmf.base.client.utils.json.modules;
    exports io.vrap.rmf.base.client.utils.json.modules.deserializers;
    exports io.vrap.rmf.base.client.utils.json.modules.serializers;

}
