package wps.srohter.SP.NameYUUID;

import org.apache.commons.lang3.RandomStringUtils;

public abstract class MakeUUID {
	public String uuid = RandomStringUtils.random(15, true, true);
	public String user;
	public abstract void makeUsername();
}
