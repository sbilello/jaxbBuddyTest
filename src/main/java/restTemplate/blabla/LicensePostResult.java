package restTemplate.blabla;



import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/*
 * @author: Sergio Bilello
 *  
 */
@XmlRootElement(name="result")
public class LicensePostResult {

	private String licenseUri;
	private String licenseName;
	private String deprecated;
	private String licenserdf;
	private String rdf;
	private String html;
	
	@XmlElement(name="deprecated")
	public String getDeprecated() {
		return deprecated;
	}
	@XmlElement(name="html")
	public String getHtml() {
		return html;
	}
	@XmlElement(name="license-name")
	public String getLicenseName() {
		return licenseName;
	}
	
	@XmlAnyElement(lax = true)
	public String getLicenserdf() {
		return licenserdf;
	}
	
	@XmlElement(name="license-uri")
	public String getLicenseUri() {
		return licenseUri;
	}
	@XmlElement(name="rdf")
	public String getRdf() {
		return rdf;
	}
	public void setDeprecated(String deprecated) {
		this.deprecated = deprecated;
	}
	public void setHtml(String html) {
		this.html = html;
	}
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}
	public void setLicenserdf(String licenserdf) {
		this.licenserdf = licenserdf;
	}
	public void setLicenseUri(String licenseUri) {
		this.licenseUri = licenseUri;
	}
	public void setRdf(String rdf) {
		this.rdf = rdf;
	}	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}