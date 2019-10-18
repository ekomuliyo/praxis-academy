param(
    [Parameter(Mandatory=$true)][string]$ComputerName
)

Get-WmiObject -Class win32_operatingSystem -ComputerName localhost
Select-Object -Property CSName,@{n="Last Booted";
e={[Management.ManagementDateTimeConverter]::ToDateTime($_LastBootTime)}}
