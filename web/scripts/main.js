$(document).ready(function () {
    $('#upload-brand').keyup(function () {
        if (isBrandNotLongEnough()) {
            $('#upload-submit').attr('disabled', true);
            $('[data-toggle="popover-brand"]').popover('show');
            $('#upload-brand').addClass('bg-danger');
        } else {
            if (!isColorNotLongEnough()) {
                $('#upload-submit').removeAttr('disabled');
            }
            $('[data-toggle="popover-brand"]').popover('hide');
            $('#upload-brand').removeClass('bg-danger');
            $('#upload-brand').addClass('bg-success');
        }
    });

    ///////////////////////////////////////////

    $('#upload-color').keyup(function () {
        if (isColorNotLongEnough()) {
            $('#upload-submit').attr('disabled', true);
            $('[data-toggle="popover-color"]').popover('show');
            $('#upload-color').addClass('bg-danger');
        } else {
            if (!isBrandNotLongEnough()) {
                $('#upload-submit').removeAttr('disabled');
            }
            $('[data-toggle="popover-color"]').popover('hide');
            $('#upload-color').removeClass('bg-danger');
            $('#upload-color').addClass('bg-success');
        }
    });

    ///////////////////////////////////////////
    disableModifyInputs();
    ///////////////////////////////////////////


    function isBrandNotLongEnough() {
        return $('#upload-brand').val().length < 3;
    }

    function isColorNotLongEnough() {
        return $('#upload-color').val().length < 3;
    }

    function disableModifyInputs() {
        $('.modify-brand-2').attr('disabled', true);
    }
});