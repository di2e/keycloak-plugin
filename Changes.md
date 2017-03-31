# Changelog

Only noting significant user changes, not internal code cleanups and minor bug fixes.

## 2.0.1 (April 1 2017)
First release on jenkins-ci infrastructure. Supported Keycloak version is now 2.5.5.Final

## Older releases
Older releases can be found at a separate [update-site](https://dl.bintray.com/devlauer/update-site/update-center.json). 
To make this site available in your jenkins instance, you have to edit the file hudson.model.UpdateCenter.xml in your configuration folder and paste the following code inside the sites node:

```xml
    <site>
      <id>elnarion-jenkins-site</id>
      <url>https://dl.bintray.com/devlauer/update-site/update-center.json</url>
      <caCertificate>-----BEGIN CERTIFICATE-----
MIIDcTCCAlmgAwIBAgIJAL6TanUM7BmsMA0GCSqGSIb3DQEBCwUAME8xCzAJBgNV
BAYTAkRFMRMwEQYDVQQIDApTb21lLVN0YXRlMSswKQYDVQQKDCJFbG5hcmlvbiB1
cGRhdGUgY2VudGVyIGZvciBqZW5raW5zMB4XDTE3MDMyNDExMzU1MFoXDTIwMDMy
MzExMzU1MFowTzELMAkGA1UEBhMCREUxEzARBgNVBAgMClNvbWUtU3RhdGUxKzAp
BgNVBAoMIkVsbmFyaW9uIHVwZGF0ZSBjZW50ZXIgZm9yIGplbmtpbnMwggEiMA0G
CSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC7JHkELmMt9xecMQkJshnlR92U6/mn
rnkLxfH75d47jGBpYrZpTtmyAwVaCDGKXko60F0WRYySp/wSL2rh4UN91M8SKB9Q
EgTPJJDc5zG4iwfunmD8fiHtw+ELcZepUt55jKqo1d4hhiaa7PwW7Ow2KAyrEVaV
6uQWUrRDK2yZ/kn7MDmrHk1ec3sXnZs56ljA1834fgi2aarJC3dD9wM809yAN/6e
Mhcfu8Q6Y81kKjIANMdAmO0/+fo1/8Sn22OAapjBPHxOeFdPhSlDrsgB3H5Yek7F
uszPP9S9TRta+ysWkEww0uAWXPYBL3ZaZdyPhDYN8QbuPEKl438uzJmNAgMBAAGj
UDBOMB0GA1UdDgQWBBRLLkO2CNufujS0xB3d+29qh+vvgTAfBgNVHSMEGDAWgBRL
LkO2CNufujS0xB3d+29qh+vvgTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBCwUA
A4IBAQCiXopJLeIV3Etln4kb+PYXoqzTVAfEmGf+vPm3up9MYrkA0X9+eeGrUUEY
b7s7xL4VZXE4IJWB5gGSi1JZH6DnLmePRAOCupM2HV7KVm65SxAFV3hticRJYDzL
v8H4qEbzSGZQlbsAYIAZnO6dLsPO96eSdSSb73loPNl5UZjC1I74WGZkpD2xHqkX
S3iGpfC6dHgN68uaeEC1xQw1Rz7M7bInM/9lAvakegQBOEvCODk652Aq3SYSfJv2
pNVwmnvTHXnJM9/aL4iaihWyAMSC4MwfHYy2NhQVwRxerd0YfyC9OUJ1UPSOsYp8
L/0l3cdCRdmmphpJqme3g3k7tlgN
-----END CERTIFICATE-----</caCertificate>
      <disabled>false</disabled>
      <note></note>
    <site>
```

As an alternative to directly editing the configuration file, you could install/use the "Manage UpdateSites Plugin" with the same values as shown above.

Afterwards you have to restart jenkins, click on the "Check now"-Button under "Manage Jenkins > Manage Plugins", select the "Keycloak Authentication Plugin" and click on "install" and "restart jenkins".