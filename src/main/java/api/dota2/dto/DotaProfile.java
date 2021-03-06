package api.dota2.dto;

import api.AbstractProfile;
import api.dota2.DotaAPI;
import api.exceptions.ConnectionException;

public class DotaProfile extends AbstractProfile
{
	public DotaProfile()
	{
		super();
	}
	
	public DotaProfile(String name, long id, long level)
	{
		super(name, id, level);
	}

	@Override
	public AbstractProfile byName(String[] strings) throws ConnectionException
	{
		return DotaAPI.getInstance().buildDotaPlayer(strings[0]);
	}
}
