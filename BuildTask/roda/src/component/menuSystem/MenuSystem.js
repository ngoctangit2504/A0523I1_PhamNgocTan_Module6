import React from "react";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
function MenuSystem() {

    return (
        <>
            <fieldset>
                <legend>Hệ thống</legend>
                <table>
                    <tr>
                        <th>
                            <FontAwesomeIcon icon="fa-solid fa-house" />
                        </th>
                        <th>
                            <FontAwesomeIcon icon="fa-solid fa-book" />
                        </th>
                    </tr>
                </table>
            </fieldset>
        </>
    );
}
export default MenuSystem;