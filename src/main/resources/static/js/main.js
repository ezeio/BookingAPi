$(document).ready(function () {

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

    var userId = +$("#userId").val();

    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "/bookings/users/"+userId,
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
            console.log(data);
            createTableRow(data);

        },
        error: function (e) {

            var json = "<h4>Error Response</h4><pre>"
                + e.responseText + "</pre>";

            console.log("ERROR : ", e);

        }
    });
}

function createTableRow(data) {
    $('#records_table tbody').remove();
    var tableBody = '';
    $.each(data,function (key, value) {
       tableBody +=
           '<tbody>'+
           '<tr><td>' + value.bookingId +
            '</td><td>'+ value.creationTime +
            '</td><td>'+ value.firstName +
            '</td><td>'+ value.lastName +
            '</td><td>'+ value.departure +
            '</td><td>'+ value.departureTime +
            '</td><td>'+ value.arrival +
            '</td><td>'+ value.arrivalTime +
            '</td><td>'+ value.noneStop +
           '</td></tr>' +
           '</tbody>'
    });

    $('#records_table').append(tableBody);

}