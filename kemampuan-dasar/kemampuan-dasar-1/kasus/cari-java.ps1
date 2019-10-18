$search = Get-ChildItem -Path C:\Scripts\* -Include *.java

if($search){
    Write-Output "Ada File java"
}else{
    Write-Output "Tidak ditemukan"
}
