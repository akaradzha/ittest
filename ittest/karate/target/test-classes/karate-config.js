function () {
    karate.configure('connectTimeout', 5000);
    karate.configure('readTimeout', 5000);
    var env = karate.env;
    if (!env) {
        env = 'test';
    }

    var port = karate.properties['server.port'];
    if (!port) {
        if (env == 'test') {
            port = 8081;
        }
    }
    var host = karate.properties['server.host'];
    if (!host) {
        if (env == 'test') {
            host = 'http://mw-tapi-test.nc.pb.ua';
        }
    }
    var base = karate.properties['server.base'];
    if (!base) {
        base = '/bus';
    }

    var config = {baseUrl: host + ':' + port + base};

    config.host = host;
    config.port = port;
    config.base = base;

    config.chameleonUrl = 'http://mw-tapi-test.nc.pb.ua/furby/chameleon/session/open';

    // config.chameleonSession = karate.callSingle('classpath:feature/chameleon.feature');

    karate.log(config.baseUrl);
    karate.log(config.chameleonUrl);
    return config;
}
