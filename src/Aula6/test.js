//make a table with reactjs


import React from 'react';
import ReactDOM from 'react-dom';


const Table = (props) => {
    return (
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Sobrenome</th>
                    <th>Idade</th>
                </tr>
            </thead>
            <tbody>
                {props.children}
            </tbody>
        </table>
    );
}

