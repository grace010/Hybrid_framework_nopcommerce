package utilities;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"file:envConfig/dev.properties"})

public interface Environment extends Config {

	@Key("App.Url")
	String appUrl();

	@Key("App.Username")
	String appUsername();

	@Key("App.Password")
	String appPassword();

	@Key("DB.Hostname")
	String databaseHostname();

	@Key("DB.User")
	String databaseUser();

	@Key("DB.Password")
	String databasePassword();
}
