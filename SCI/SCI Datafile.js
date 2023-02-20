let saveFile = () => {

    // Get the data from each element on the form.
    const UserName = document.getElementById('UserName');
    const AadharNo = document.getElementById('Aadhar');
    const MobileNo = document.getElementById('Mobile');
    const OTP = document.getElementById('OTP');

    // This variable stores all the data.
    let data =
        '\r User Name: ' + UserName.value + ' \r\n ' +
        'Aadhar No: ' +AadharNo.value + ' \r\n ' +
        'Mobile No: ' + MobileNo.value + ' \r\n ' +
        'OTP: ' + OTP.value + ' \r\n ';


    // Convert the text to BLOB.

    const textToBLOB = new Blob([data], { type: 'text/plain' });
    const sFileName = 'formData.txt';	   // The file to save the data.

    let newLink = document.createElement("a");
    newLink.download = sFileName;

    if (window.webkitURL != null) {
        newLink.href = window.webkitURL.createObjectURL(textToBLOB);
    }
    else {
        newLink.href = window.URL.createObjectURL(textToBLOB);
        newLink.style.display = "none";
        document.body.appendChild(newLink);
    }

    newLink.click();
}