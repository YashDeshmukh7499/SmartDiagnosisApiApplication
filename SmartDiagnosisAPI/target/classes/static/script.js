async function diagnose() {

    const symptoms = document.getElementById("symptoms").value;

    const response = await fetch("http://localhost:8080/api/diagnose", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            symptoms: symptoms
        })
    });

    const data = await response.json();

    let output = "";

    data.forEach(item => {
        output += `
            <p><b>Condition:</b> ${item.conditionName}</p>
            <p><b>Probability:</b> ${item.probability}</p>
            <p><b>Next Step:</b> ${item.nextStep}</p>
            <hr>
        `;
    });

    document.getElementById("result").innerHTML = output;
}